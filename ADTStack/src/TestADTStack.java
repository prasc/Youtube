public class TestADTStack {

    public static void main(String[] args) {
        ADTStack stack = new ADTStack(10);

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack.toString());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
