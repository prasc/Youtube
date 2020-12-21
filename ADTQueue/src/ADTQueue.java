public class ADTQueue<T> {

    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node front;

    public ADTQueue() {
        front = null;
    }

    public void enqueue(T item) {
        if (front == null) {
            front = new Node(item, null);
            front.next = front;
        } else {
            front.next = new Node(item, front.next);
            front = front.next;
        }
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("The list is empty");
        return front.next.item;
    }

    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("The list is empty");

        T temp = front.next.item;

        if (front == front.next) {
            front = null;
        } else {
            front.next = front.next.next;
        }

        return temp;
    }

    public void dequeueAll() {
        front = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public String toString() {
        String str = "[";
        if (front == null) return "Empty";

        Node curr = front.next;
        str = str + curr.item;

        while (curr != front) {
            curr = curr.next;
            str = str + ", "  + curr.item;
        }
        return str + "]";
    }

}
