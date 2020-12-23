public class ADTLinkedList<T> {         // <T> signifies generic type, can be replaced by anything

    private class Node {
        T item;                     // item of type T  can be String, Integer, Double, etc
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node head;

    public ADTLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(T item) {
        if (isEmpty()) {
            head = new Node(item, null);
        } else {
            head = new Node(item, head);
        }
    }

    public void addToBack(T item) {
        if (isEmpty()) {
            head = new Node(item, null);
        } else {
            Node curr = head;

            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = new Node(item, null);
        }
    }

    public void removeFromFront() {
        if (isEmpty()) throw new RuntimeException("Nothing to remove");
        head = head.next;
    }

    public void removeFromBack() {
        if (isEmpty()) throw new RuntimeException("Nothing to remove");

        Node prev = null;
        Node curr = head;

        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
    }

    public T get(int pos) {
        if (pos < 1) throw new RuntimeException("Position is invalid");

        Node curr = head;
        while (curr != null && pos != 1) {
            curr = curr.next;
            pos--;
        }

        if (curr == null) throw new RuntimeException("No item at this position");

        return curr.item;

    }




    public int size() {
        int count = 0;

        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            count++;
        }

        return count;
    }

    public void removeAll() {
        head = null;
    }

}
