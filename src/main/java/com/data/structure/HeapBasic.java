package com.data.structure;

import java.util.PriorityQueue;

public class HeapBasic {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(50);
        heap.add(40);
        heap.add(23);
        heap.add(250);
        System.out.println(heap.poll());
        heap.add(-1);
        while(!heap.isEmpty())
            System.out.println(heap.poll());
    }
}
