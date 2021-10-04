package com;
import org.apache.commons.lang3.time.StopWatch;

class Main {
	public static void main(String[] args) throws InterruptedException {
		int j;
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		operation();
		stopwatch.stop();

		System.out.println("Timespent is: " + stopwatch.getTime() + "ms");
	}

	private static void operation() throws InterruptedException {
		Thread.sleep(10);
	}
}