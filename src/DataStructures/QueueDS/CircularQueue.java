package DataStructures.QueueDS;

import java.util.Arrays;

public class CircularQueue {

    private int size;
    private final int capacity;
    private int[] queue;
    private int front;
    private int rear;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.queue = new int[this.capacity];
        this.front = 0;
        this.rear = capacity - 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean enqueue(int element) {

        if(size == capacity) return false;
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
        return true;
    }

    public int dequeue() {

        if(isEmpty()) return -1;
        int element = queue[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(isEmpty()) sb.append("[]");
        else if(rear < front) {
            for (int i = front; i < capacity; i++) {
                sb.append(queue[i]).append(" ");
            }
            for (int i = 0; i <= rear; i++) {
                sb.append(queue[i]).append(" ");
            }
        }
        else {
            for (int i = front; i <= rear; i++) {
                sb.append(queue[i]).append(" ");
            }
        }
        return sb.toString();
    }
}
