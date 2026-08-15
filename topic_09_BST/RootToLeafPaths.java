package topic_09_BST;

import java.util.ArrayList;

public class RootToLeafPaths {
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

    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // inorder
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // print path
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println();
    }

    // Time Complexity = O(N) where N = number of nodes
    // Space Complexity = O(H) where H = height of the tree
    public static void rootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        // leaf node
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
        }

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        // preorder
        int values[] = { 8, 5, 3, 6, 10, 11, 14 };

        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // print inorder traversal
        inorder(root);
        System.out.println();

        ArrayList<Integer> path = new ArrayList<>();
        rootToLeaf(root, path);
    }
}
