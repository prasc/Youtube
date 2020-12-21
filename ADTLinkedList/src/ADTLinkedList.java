public class ADTLinkedList<T> {

    private class Node {
        T item;
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

    public int size() {
        int count = 0;

        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            count++;
        }

        return count;
    }

    public void add(T item, int pos) {
        Node curr = head;
        Node prev = null;

        while (pos > 1 && curr != null) {
            prev = curr;
            curr = curr.next;
            pos--;
        }

        if (prev == null) {
            head = new Node(item, curr);
        } else {
            prev.next = new Node(item, curr);
        }
    }

    public void remove(int pos) {
        if (isEmpty()) throw new RuntimeException("The list is empty");
        if (pos < 1 || pos > size()) throw new RuntimeException("The position is invalid");

        Node prev = find(pos);
        Node curr = prev == null ? head : prev.next;

        if (prev == null) {
            head = curr.next;
        } else {
            prev.next = curr.next;
        }
    }

    public T get(int pos) {
        if (isEmpty()) throw new RuntimeException("The list is empty");
        if (pos < 1 || pos > size()) throw new RuntimeException("The position is invalid");

        Node prev = find(pos);
        Node curr = prev == null ? head : prev.next;

        return curr.item;
    }

    private Node find(int pos) {
        Node curr = head;
        Node prev = null;

        while (pos > 1 && curr != null) {
            prev = curr;
            curr = curr.next;
            pos--;
        }

        return prev;
    }

    public void removeAll() {
        head = null;
    }

}
