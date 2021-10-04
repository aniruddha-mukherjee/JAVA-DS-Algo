package com.design.pattern.strategy.cache;


import java.util.HashMap;
import java.util.Map;

public class LRUEvictionPolicy implements IEvictionPolicy{

	Map<Integer, Node> dll ;
	Node fStart;
	Node fEnd;

	public LRUEvictionPolicy() {
		dll = new HashMap<>();
	}

	@Override
	public void put(int key) {
		Node temp =  new Node(key);
		if(fStart == null)
			fStart = temp;
		if(fEnd == null)
			fEnd = temp;
		else {
			fEnd.next = temp;
			temp.prev = fEnd;
			fEnd = temp;
		}
		dll.put(key, temp);
	}

	@Override
	public void get(int key) {
		if(fStart ==null)
			return;
		Node current = dll.get(key);
		removeNode(current);
		//move to start
		current.next = fStart;

		fStart.prev = current;
		fStart = current;
	}

	private void removeNode(Node node){
		if(node == null)
			return;
		if(fStart == node && fEnd == node)
			return;
		if(fStart == node) {
			node.next.prev = null;
			fStart = node.next;
			return;
		}
		if(fEnd == node){
			node.prev.next = null;
			fEnd = node.prev;
			return;
		}
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}


	@Override
	public int evict() {
		Node head = fStart;
		fStart.next.prev = null;
		fStart = fStart.next;
		return head.getKey();
	}

	public void printCache(){
		System.out.println("\n");
		Node current  = fStart;
		while(current != null) {
			System.out.print(current.getKey());
			current = current.next;
		}
	}
}
