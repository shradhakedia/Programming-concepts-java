package DataStructures.StackDS;

public class DynamicStack<G> extends StaticStack<G>{

    private static final int STACK_CAPACITY = 5;

    public DynamicStack() {
        super(STACK_CAPACITY);
    }

    @Override
    public boolean push(G element) {
        top += 1;
        stack.add(element);
        size++;
        return true;
    }

}
