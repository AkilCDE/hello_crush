class BST{

  
    static class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    static class BinarysearchTree {
        Node root;

        public BinarysearchTree() {
            root = null;
        }

        public void insert(int value) {
            root = insertRec(root, value);
        }

        private Node insertRec(Node root, int value) {
            if (root == null) {
                root = new Node(value);
                return root;
            }
            if (value < root.value) {
                root.left = insertRec(root.left, value);
            } else if (value > root.value) {
                root.right = insertRec(root.right, value);
            }
            return root;
        }

        public void inOrder() {
            inOrderRec(root);
            System.out.println();
        }

        private void inOrderRec(Node root) {
            if (root != null) {
                inOrderRec(root.left);
                System.out.print(root.value + " ");
                inOrderRec(root.right);
            }
        }

        public void preOrder() {
            preOrderRec(root);
            System.out.println();
        }

        private void preOrderRec(Node root) {
            if (root != null) {
                System.out.print(root.value + " ");
                preOrderRec(root.left);
                preOrderRec(root.right);
            }
        }

        public void postOrder() {
            postOrderRec(root);
            System.out.println();
        }

        private void postOrderRec(Node root) {
            if (root != null) {
                postOrderRec(root.left);
                postOrderRec(root.right);
                System.out.print(root.value + " ");
            }
        }
    }

    public static void main(String[] args) {
        BinarysearchTree bst = new BinarysearchTree();

      
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(8);
        bst.insert(20);

       
        System.out.println("In-Order Traversal:");
        bst.inOrder(); 

        System.out.println("Pre-Order Traversal:");
        bst.preOrder(); 

        System.out.println("Post-Order Traversal:");
        bst.postOrder();
    }
}
