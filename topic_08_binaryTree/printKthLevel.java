package topic_08_binaryTree;

public class printKthLevel {
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

    // Time Complexity: O(n)
    public static void kthLevel(Node root, int k) {
        if (root == null) {
            return;
        }

        if (k == 1) {
            System.out.print(root.data + " ");
            return;
        }

        kthLevel(root.left, k - 1);
        kthLevel(root.right, k - 1);
    }

    public static void main(String[] args) {
        int nodes[] = { -1, -1, 4, -1, -1, 5, 2, -1, -1, 6, -1, -1, 7, 3, 1 };

        BinaryTree tree = new BinaryTree();
        idx = nodes.length;
        Node root = tree.buildTree(nodes);

        kthLevel(root, 3);
    }
}
