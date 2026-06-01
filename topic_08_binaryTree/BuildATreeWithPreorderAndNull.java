package topic_08_binaryTree;
// Build Tree from given preorder sequence with null

public class BuildATreeWithPreorderAndNull {
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

    // preorder - O(n)
    public static void preorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder - O(n)
    public static void inorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("root = " + root.data);
        preorder(root);
        System.out.println();
        inorder(root); // 4 2 5 1 3 6
    }
}
