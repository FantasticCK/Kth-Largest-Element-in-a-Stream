package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class KthLargest {
    PriorityQueue<Integer> q;
    int k;

    public KthLargest(int k, int[] a) {
        this.k = k;
        q = new PriorityQueue<>(k);
        for (int n : a)
            add(n);
    }

    public int add(int n) {
        if (q.size() < k)
            q.offer(n);
        else if (q.peek() < n) {
            q.poll();
            q.offer(n);
        }
        return q.peek();
    }
}