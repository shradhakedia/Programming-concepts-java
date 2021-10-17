package DataStructures.QueueDS;

import java.util.Arrays;
import java.util.LinkedList;

public class QueueUsingLL<E> {

    private LinkedList<E> queue;

    public QueueUsingLL(int capacity) {
        this.queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean enqueue(E element) {
        queue.addLast(element);
        return true;
    }

    public E dequeue() {
        if(isEmpty()) return null;
        return queue.removeFirst();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
