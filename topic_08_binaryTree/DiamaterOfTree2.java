package topic_08_binaryTree;

public class DiamaterOfTree2 {
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

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter(Node root) {

        if (root == null) {
            return new TreeInfo(0, 0);
        }

        // information of left and right subtree
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        // height
        int myHeight = Math.max(left.ht, right.ht) + 1;

        // diameter - O(N)
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        // return myHeight and myDiam through an object of TreeInfo
        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // diameter method call
        System.out.println("diameter = " + diameter(root).diam); // 5
    }
}
