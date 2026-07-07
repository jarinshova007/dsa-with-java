package topic_08_binaryTree;

public class SubtreeOrNot {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        int idx = -1;

        public Node buildTree(int nodes[]) {

            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // isIdentical
    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }

        return false;

    }

    // isSubtree
    public static boolean isSubtree(Node root, Node subRoot) {

        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        int nodes1[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int nodes2[] = { 3, -1, 6, -1, -1 };

        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        Node root = tree1.buildTree(nodes1);
        Node subRoot = tree2.buildTree(nodes2);

        // method call
        if (isSubtree(root, subRoot)) {
            System.out.println("tree2 is a subtree of tree1"); // true
        } else {
            System.out.println("tree2 is not a subtree of tree1");
        }
    }
}
