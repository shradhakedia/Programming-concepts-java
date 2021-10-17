package DataStructures.QueueDS;

public class Main {
    public static void main(String[] args) {
        QueueUsingLL<Integer> queue = new QueueUsingLL(5);
        System.out.println(queue.enqueue(1));
        System.out.println(queue.enqueue(2));
        System.out.println(queue.enqueue(3));
        System.out.println(queue.enqueue(4));
        System.out.println(queue);
        System.out.println(queue.enqueue(5));
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.enqueue(6));
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.enqueue(6));
        System.out.println(queue);

    }
}
