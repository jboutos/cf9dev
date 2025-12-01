package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

public class QueueDemo {

    public static int[] queue = new int[10];
    static int top = -1;
    public static void main(String[] args) {
        int num;

        enQueue(1);
        enQueue(2);
        enQueue(3);
        printQueue();

        num = deQueue();
        printQueue();
    }

    public static void enQueue(int val) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        queue[++top] = val;
    }

    public static int deQueue() {
        int num = 0;

        if (isEmpty()) throw new RuntimeException("Queue is empty");
        num = queue[0];

        queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
        top--;
        return num;
    }

    public static boolean isFull() {
        return (top == queue.length - 1);
    }

    public static boolean isEmpty() {
        return (top == - 1);
    }

    public static void printQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Empty queue");
        }

        for (int i = 0; i <= top; i++) {
            System.out.println(queue[i] + " ");
        }

        System.out.println();
    }
}
