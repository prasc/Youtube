// Array Based Implementation

public class ADTStack {
    private final int MAX_SIZE;
    private int size;
    private int top;
    private int[] stack;

    public ADTStack(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        stack = new int[MAX_SIZE];
        size = 0;
    }

    public void push(int item) {
        if (size == MAX_SIZE) throw new RuntimeException("The stack is full");
        stack[size] = item;
        size++;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("The stack is empty");
        return stack[size - 1];
    }

    public int pop() {
        int temp = peek();
        size--;
        stack[size] = 0;
        return temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void popAll() {
        stack = new int[MAX_SIZE];
        size = 0;
    }

    public String toString() {

        String str = "[";
        System.out.println(size);
        for (int i = 0; i < size - 1; i++) {
            str += stack[i] + ",";
        }

        str += stack[size - 1] + "]";
        return str;
    }


}
