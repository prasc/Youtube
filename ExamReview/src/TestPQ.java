public class TestPQ {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.insert(50);
        pq.insert(10);
        pq.insert(0);
        pq.insert(100);
        pq.insert(450);

        System.out.println(pq.peek());

    }
}
