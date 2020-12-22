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
        return head == null;          // head == null will evaluate to true, if linked list is empty, otherwise false
    }

    public int size() {
        int count = 0;

        Node curr = head;           // start at beginning of lineked list
        while (curr != null) {      // loop until tail
            curr = curr.next;
            count++;                // inc count for each additional link
        }

        return count;
    }

    // returns null or returns the item at the position indicated
    private Node find(int pos) {
        Node curr = head;
        Node prev = null;

        while (pos > 1 && curr != null) {   // loop through linked list until pos is 1 or curr = tail
            prev = curr;
            curr = curr.next;
            pos--;
        }

        return prev;
    }

    public T get(int pos) {
        if (isEmpty()) throw new RuntimeException("The list is empty");
        if (pos < 1 || pos > size()) throw new RuntimeException("The position is invalid");

        Node prev = find(pos);
        Node curr = prev == null ? head : prev.next;

        return curr.item;
    }

    // idea is to start at head and loop through chain until we find correct position
    // if list is empty, add at head
    // if list is not empty, add new node after prev and before curr
    public void add(T item, int pos) {
        Node curr = head;
        Node prev = null;

        while (pos > 1 && curr != null) {
            prev = curr;
            curr = curr.next;
            pos--;
        }

        if (prev == null) {
            head = new Node(item, curr);        // adding to beginning of linked list
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

    public void removeAll() {
        head = null;
    }

}
