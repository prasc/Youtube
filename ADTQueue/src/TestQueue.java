public class TestQueue {

    public static void main(String[] args) {
        ADTQueue<String> queue = new ADTQueue<String>();


        queue.enqueue("Kyle Lowry");

        System.out.println(queue.toString());

        queue.enqueue("Fred VanVleet");
        queue.enqueue("Pascal Siakam");

        System.out.println(queue.toString());

        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());

        queue.dequeueAll();
        System.out.println(queue.isEmpty());


    }
}
