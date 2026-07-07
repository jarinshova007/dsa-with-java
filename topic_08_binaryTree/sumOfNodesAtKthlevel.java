package topic_08_binaryTree;

public class sumOfNodesAtKthlevel {
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
    public static int sumOfNodesAtKthLevel(Node root, int k) {
        if (root == null) {
            return 0;
        }

        if (k == 1) {
            return root.data;
        }

        int leftSum = sumOfNodesAtKthLevel(root.left, k - 1);
        int rightSum = sumOfNodesAtKthLevel(root.right, k - 1);

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        int nodes[] = { -1, -1, 4, -1, -1, 5, 2, -1, -1, 6, -1, -1, 7, 3, 1 };

        BinaryTree tree = new BinaryTree();
        idx = nodes.length;
        Node root = tree.buildTree(nodes);

        int x = sumOfNodesAtKthLevel(root, 3);
        System.out.println(x);
    }
}
