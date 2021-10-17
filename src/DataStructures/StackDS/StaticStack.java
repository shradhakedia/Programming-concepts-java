package DataStructures.StackDS;

import java.util.ArrayList;
import java.util.List;

public class StaticStack<G> {
    protected int top;
    protected int size;
    private final int capacity;
    protected List<G> stack;

    public StaticStack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        this.size = 0;
        this.stack = new ArrayList<>(capacity);
    }

    public boolean push(G element) {
        try {
            if(size == capacity) {
                throw new Exception("Error: Stack is full");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        top += 1;
        stack.add(element);
        size++;
        return true;
    }

    public G pop() {
        try {
            if(isEmpty()) {
                throw new Exception("Error: Stack is Already empty");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        G popElement = stack.remove(top);
        top--;
        size--;
        return popElement;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public G peek() {
        try {
            if(isEmpty()) {
                throw new Exception("Error: Stack is empty");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return stack.get(top);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(isEmpty()) sb.append("[]");
        else {
            for (G ele : stack) {
                sb.append(ele).append(" ");
            }
        }
        return sb.toString();
    }

}
