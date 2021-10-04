package com.design.pattern.strategy.cache;

public class Node {
	private int key;
	Node next;
	Node prev;

	public Node(int key) {
		this.key = key;
		this.next = null;
		this.prev = null;
	}

	public int getKey() {
		return key;
	}


}
