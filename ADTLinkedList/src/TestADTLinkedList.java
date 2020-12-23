public class TestADTLinkedList {
    public static void main(String[] args) {
        ADTLinkedList linkedList = new ADTLinkedList<String>();

        linkedList.addToFront("Kobe Bryant");
        linkedList.addToFront("Wilt Chamberlain");
        linkedList.addToFront("Jrue Holiday");
        linkedList.addToBack("Kyle Lowry");

        System.out.println("The second item is: " + linkedList.get(2));
        System.out.println("The third item is: " + linkedList.get(3));
        System.out.println("The last item is: " + linkedList.get(4));

        System.out.println();
        System.out.println("The size is: " + linkedList.size());

        linkedList.removeFromBack();
        System.out.println("The size is: " + linkedList.size());

        System.out.println();
        System.out.println("Linked list is empty: " + linkedList.isEmpty());
        linkedList.removeAll();
        System.out.println("Linked list is empty: " + linkedList.isEmpty());

    }
}
