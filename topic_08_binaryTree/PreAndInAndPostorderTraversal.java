package topic_08_binaryTree;

public class PreAndInAndPostorderTraversal {
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

    static int idx;

    static class BinaryTree {
        public Node buildTree(int nodes[]) {
            idx--;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.right = buildTree(nodes);
            newNode.left = buildTree(nodes);

            return newNode;
        }
    }

    // preorder - O(n)
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder - O(n)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // postorder - O(n)
    public static void postorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " "); // prints the null nodes
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " "); // add a new line to print the data as it is
    }

    public static void main(String[] args) {
        int nodes[] = { -1, -1, 4, -1, -1, 5, 2, -1, -1, 6, -1, -1, 7, 3, 1 };

        BinaryTree tree = new BinaryTree();
        idx = nodes.length;
        Node root = tree.buildTree(nodes);

        // method call
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }
}
