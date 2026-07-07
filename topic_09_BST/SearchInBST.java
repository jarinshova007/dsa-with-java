package topic_09_BST;

public class SearchInBST {
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

    static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        }

        if (val > root.data) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Time Complexity - O(H)
    // H = height of the BST
    // Average: O(log n)
    // Worst: O(n)
    public static boolean search(Node root, int target) {
        if (root == null) {
            return false;
        } else if (root.data == target) {
            return true;
        } else if (root.data > target) {
            return search(root.left, target);
        } else {
            return search(root.right, target);
        }
    }

    public static void main(String[] args) {
        // level order
        int values[] = { 8, 3, 10, 1, 6, 14, 4, 7, 13 };

        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        if (search(root, 16)) {
            System.out.println("found!");
        } else {
            System.out.println("not found!");
        }
    }
}
