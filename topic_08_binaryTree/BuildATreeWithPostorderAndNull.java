package topic_08_binaryTree;
// Build Tree from given preorder sequence with null

public class BuildATreeWithPostorderAndNull {
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

            // left -> right -> root
            Node newNode = new Node(nodes[idx]);
            newNode.right = buildTree(nodes);
            newNode.left = buildTree(nodes);

            return newNode;
        }
    }

    // postorder - O(n)
    public static void postorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " "); // add a new line to print the data as it is
    }

    public static void main(String[] args) {
        int nodes[] = {
                -1, -1, 4,
                -1, -1, 5,
                2,
                -1, -1, 3,
                1
        };

        // int nodes[] = { -1, -1, 4, -1, -1, 5, 2, -1, -1, -1, 6, 3, 1 };

        BinaryTree tree = new BinaryTree();
        idx = nodes.length;
        Node root = tree.buildTree(nodes);

        System.out.println("root = " + root.data); // root = 1;
        postorder(root); // 4, 5, 2, 3, 1
    }
}
