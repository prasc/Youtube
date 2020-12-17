class BST {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = null;
            right = null;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public int getKey() {
            return key;
        }
    }

    Node root;

    BST() {
        root = null;
    }

    public void insert(int key) {
        root = inserting(root, key);
    }

    public Node inserting(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = inserting(root.left, key);
        } else if (key > root.key) {
            root.right = inserting(root.right, key);
        }
        return root;
    }

    public Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (key > root.key) {
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }
    }

    public void deleteKey(int key) {
        root = deleting(root, key);
    }

    private Node deleting(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = deleting(root.left, key);
        } else if (key > root.key) {
            root.right = deleting(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.key = findMin(root.right);
            root.right = deleting(root.right, root.key);
        }
        return root;
    }

    public Integer findMin() {
        Node curr = root;
        while (curr.getLeft() != null) {
            curr = curr.getLeft();
        }

        return curr.getKey();
    }

    public Integer findMin(Node root) {
        Node curr = root;
        while (curr.getLeft() != null) {
            curr = curr.getLeft();
        }

        return curr.getKey();
    }

    public Integer findMax() {
        Node curr = root;
        while (curr.getRight() != null) {
            curr = curr.getRight();
        }

        return curr.getKey();
    }

    public void displayInOrder() {
        if (root == null) {
            System.out.println("Tree is empty");
        }
        else {
            inOrder(root);
            System.out.println();
        }
    }

    private void inOrder(Node curr) {
        if (curr != null) {
            inOrder(curr.getLeft());
            System.out.print(curr.getKey() + " ");
            inOrder(curr.getRight());
        }

    }

}