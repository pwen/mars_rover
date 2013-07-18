package com.twu.rover;

//package rover;

public class Queue<T> {

    private int size;
    private Node<T> front, back;

    private class Node<T> {
        private T item;
        private Node<T> next;

        public Node(T item, Node<T> next){
            this.item = item;
            this.next = next;
        }
    }

    public Queue(){
        front = back = null;
        size = 0;
    }

    public void enqueue(T item){
        if (front == null){
            front = back = new Node<T>(item, null);
        } else {
            back.next = new Node<T>(item, null);
            back = back.next;
        }
        ++size;
    }

    public T dequeue(){
        Node<T> dequeue;
        if (front == null) {
            return null;
        }
        if (front == back) {
            dequeue = front;
            front = back = null;
            return dequeue.item;
        }
        dequeue = front;
        front = front.next;
        --size;
        return dequeue.item;
    }

    public T front() {
        if (front == null) {
            return null;
        }
        return front.item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    // test code
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();

        q.enqueue(100);
        q.enqueue(10);
        q.enqueue(50);
        System.out.println(q);
        System.out.println("size:"+q.size());

        System.out.println(q.dequeue());
        System.out.println("size:"+q.size());

    }
}


