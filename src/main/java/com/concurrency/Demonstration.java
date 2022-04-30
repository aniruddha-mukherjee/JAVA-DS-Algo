package com.concurrency;

class Demonstration {
    public static void main(String[] args) throws InterruptedException {
        SumUpExample.runTest(100);
    }
}

class SumUpExample {

    static long MAX_NUM = Integer.MAX_VALUE;
    long startRange;
    long endRange;
    long counter = 0;

    public SumUpExample(long startRange, long endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }

    static public void manyThreads(int parts) throws InterruptedException {

        long start = System.currentTimeMillis();
        long finalCount = 0;

        Thread[] threads = new Thread[parts];
        SumUpExample[] examples = new SumUpExample[parts];

        for (int i = 0; i < parts; i++) {
            if (i == 0)
                examples[i] = new SumUpExample(1, MAX_NUM / parts);
            else
                examples[i] = new SumUpExample(1 + i * MAX_NUM / parts, (i + 1) * MAX_NUM / parts);

            int finalI = i;
            threads[i] = new Thread(() -> {
                examples[finalI].add();
            });
            threads[i].start();
        }

        for (int i = 0; i < parts; i++) {
            threads[i].join();
            finalCount += examples[i].counter;
        }


        long end = System.currentTimeMillis();
        System.out.println(String.format(" %s threads final count = %s took %s", parts, finalCount, (end - start)));
    }

    static public void oneThread() {

        long start = System.currentTimeMillis();
        SumUpExample s = new SumUpExample(1, MAX_NUM);
        s.add();
        long end = System.currentTimeMillis();
        System.out.println("Single thread final count = " + s.counter + " took " + (end - start));
    }

    public static void runTest(int parts) throws InterruptedException {
        oneThread();

        for(int i = 10; i<=parts; i= i+10)
            manyThreads(i);

        manyThreads(parts);

    }

    public void add() {

        for (long i = startRange; i <= endRange; i++) {
            counter += i;
        }
    }
}

