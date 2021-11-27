package com.data.structure;

import java.util.ArrayList;
import java.util.List;

class Node {
    private int val;
    private Node next;

    Node(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setNext(int val) {
        this.next = new Node(val);
    }

    public boolean isNextNotNull(){
        return getNext() != null;
    }
}

class LL {
    private Node head;

    public Node getHead(){
        return head;
    }
    public void append(int[] values) {
        for (int value : values)
            append(value);
    }

    public void append(int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }

        Node temp = head;
        while (temp.getNext() != null)
            temp = temp.getNext();

        temp.setNext(val);
    }

    public void append(Node node){
        Node temp = head;
        while (temp.getNext() != null)
            temp = temp.getNext();
        temp.setNext(node);
    }

    public void print() {
        if (head == null) {
            System.out.print("Empty List");
            return;
        }
        List<Integer> list = new ArrayList<Integer>();
        Node temp = head;

        while (temp != null) {
            list.add(temp.getVal());
            temp = temp.getNext();
        }

        System.out.println(list);
    }

    public Node getParent(int key) {
        if (head == null || head.getVal() == key)
            return null;

        Node temp = head;
        while (temp.isNextNotNull()) {
            if (temp.getNext().getVal() == key) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }


    public boolean delete(int key) {
        if (head == null)
            return false;

        if(head.getVal() == key) {
            head = head.getNext();
            return true;
        }

        Node parent = getParent(key);
        if (parent == null)
            return false;

        parent.setNext(parent.getNext().getNext());
        return true;
    }

    public int getSize(){
        if(head ==null)
            return 0;
        return getSize(head);
    }

    public int getSize(Node head){
        if(head ==null)
            return 0;
        return 1 + getSize(head.getNext());
    }

    public void reset(){
        head = null;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}


public class LinkedList {

    public static int findNthNode(Node head, int count){
        if(head==null)
            return -1;

        Node temp = head;
        int current = 1;

        while(temp != null){
            if(current == count)
                return temp.getVal();
            else{
                temp = temp.getNext();
                current++;
            }
        }
        return -1;
    }
    public static int getMiddle(LL ll){
        Node head = ll.getHead();

        if(head ==null)
            return -1;

        if(head.getNext() == null)
            return head.getVal();

        Node fast = head, slow = head;

        while(fast.getNext()!=null && fast.getNext().getNext()!=null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow.getVal();
    }

    public static boolean detectLoop(LL ll){
        Node head = ll.getHead();

        if(head == null || head.getNext() == null || head.getNext().getNext() ==null)
            return false;

        Node fast = head.getNext().getNext(), slow= head.getNext();

        while(true){
            if(fast.getNext() == null || fast.getNext().getNext() == null || fast == slow)
                break;
            fast= fast.getNext().getNext();
            slow= slow.getNext();
        }

        if(slow == fast)
            return true;

        return false;
    }

    public static int countNodesInLoop(LL ll){
        Node head = ll.getHead();

        if(head == null || head.getNext() == null || head.getNext().getNext() == null)
            return -1;

        Node fast = head.getNext().getNext();
        Node slow = head.getNext();

        while(fast.getNext()!= null && fast.getNext().getNext() != null && slow !=fast){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        if(slow != fast)
            return -1;

        int count = 1;
        fast= fast.getNext();


        while(slow != fast){
            count++;
            fast= fast.getNext();
        }

        return count;
    }

    public static Node reverseUtil(Node head){
        if(head == null || head.getNext() == null)
            return head;

        Node newHead = reverseUtil(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);

        return newHead;
    }

    public static void reverse(LL ll){
        Node newHead = reverseUtil(ll.getHead());
        ll.setHead(newHead);
    }

    public static void reverseIterative(LL ll){
        if(ll.getHead() == null)
            return;

        Node prev = null;
        Node current = ll.getHead();
        Node next = null;

        while(current != null){
            next = current.getNext();
            current.setNext(prev);

            prev = current;
            current = next;
        }

            ll.setHead(prev);
    }

    public static Node mergeKLists(Node[] lists) {
        if(lists.length == 0 )
            return null;

        if(lists.length == 1 )
            return lists[0];

        int last = lists.length -1;

        while(last != 0){
            int i = 0, j = last;
            while (i < j) {

                lists[i] = mergeTwoLists(lists[i], lists[j]);
                i++;
                j--;

                if (i >= j) {
                    last = j;
                }
            }
        }
        return lists[0];
    }


    public static Node mergeTwoLists(Node list1, Node list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        Node p1 = list1, p2 = list2;
        Node result = null, current = null;

        while(p1 != null && p2 != null){
            if(p1.getVal() < p2.getVal()){
                if(result == null){
                    result = p1;
                    current = result;
                }else{
                    current.setNext(p1);
                    current = current.getNext();
                }
                p1 = p1.getNext();
            }

            else {
                if(result == null){
                    result = p2;
                    current = result;
                } else{
                    current.setNext(p2);
                    current = current.getNext();
                }
                p2 = p2.getNext();
            }
        }

        while(p1 != null) {
            current.setNext(p1);
            p1 = p1.getNext();
            current= current.getNext();
        }

        while(p2 != null){
            current.setNext(p2);
            p2 = p2.getNext();
            current = current.getNext();
        }

        //current.getNext() = null;

        return result;
    }

    public static void main(String[] args) {
        LL ll1 = new LL();
        //int[] values = {1,2,3,4,5,6,7};
        //ll.append(values);
        Node[] lists = new Node[4];
        ll1.append(new int[]{});
        lists[0] = ll1.getHead();

        LL ll2 = new LL();
        ll2.append(new int[]{-1,5,11});
        lists[1] = ll2.getHead();

        LL ll3 = new LL();
        ll3.append(new int[]{});
        lists[2] = ll3.getHead();

        LL ll4 = new LL();
        ll4.append(new int[]{6,10});
        lists[3] = ll4.getHead();

        LL ll = new LL();
        ll.setHead(mergeKLists(lists));
        ll.print();
        //reverseIterative(ll);
        //ll.print();
    //[[],[-1,5,11],[],[6,10]]

        //System.out.println(countNodesInLoop(ll));
    }
}
