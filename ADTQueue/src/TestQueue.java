public class TestQueue {

    public static void main(String[] args) {
        ADTQueue<String> queue = new ADTQueue<String>();


        queue.enqueue("Kyle Lowry");

        System.out.println("The queue: " + queue.toString());

        queue.enqueue("Pascal Siakam");
        queue.enqueue("Fred VanVleet");

        System.out.println("The queue: " + queue.toString());

        System.out.println("The front of the queue is: " + queue.peek());
        queue.dequeue();
        System.out.println("The front of the queue is: " + queue.peek());

        queue.dequeueAll();
        System.out.println(queue.isEmpty());


    }
}
