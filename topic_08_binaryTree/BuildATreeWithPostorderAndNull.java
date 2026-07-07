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

    public static void main(String[] args) {
        int nodes[] = {
                -1, -1, 4,
                -1, -1, 5,
                2,
                -1, -1, 3,
                1
        };

        BinaryTree tree = new BinaryTree();
        idx = nodes.length;
        Node root = tree.buildTree(nodes);

        System.out.println("root = " + root.data); // root = 1;
    }
}
