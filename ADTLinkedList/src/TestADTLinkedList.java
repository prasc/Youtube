public class TestADTLinkedList {
    public static void main(String[] args) {
        ADTLinkedList linkedList = new ADTLinkedList<String>();

        linkedList.add("Kobe Bryant", 1);
        linkedList.add("Wilt Chamberlain", 2);
        linkedList.add("Jrue Holiday", 3);

        System.out.println("The second item is: " + linkedList.get(2));
        System.out.println("The third item is: " + linkedList.get(3));
        System.out.println("The size is: " + linkedList.size());

        linkedList.remove(2);
        System.out.println("The second item is: " + linkedList.get(2));

        System.out.println("Linked list is empty: " + linkedList.isEmpty());
        linkedList.removeAll();
        System.out.println("Linked list is empty: " + linkedList.isEmpty());

    }
}
