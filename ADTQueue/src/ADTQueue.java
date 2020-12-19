public class ADTQueue<T> {

    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node top;

    public ADTQueue() {
        top = null;
    }

    public void enqueue(T item) {
        if (top == null) {
            top = new Node(item, null);
            top.next = top;
        } else {
            top.next = new Node(item, top.next);
            top = top.next;
        }
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("The list is empty");
        return top.next.item;
    }

    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("The list is empty");

        T temp = top.next.item;

        if (top == top.next) {
            top = null;
        } else {
            top.next = top.next.next;
        }

        return temp;
    }

    public void dequeueAll() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String toString() {
        String str = "[";
        if (top == null) return "Empty";

        Node curr = top.next;
        str = str + curr.item;

        while (curr != top) {
            curr = curr.next;
            str = str + ", "  + curr.item;
        }
        return str + "]";
    }

}
