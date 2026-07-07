package topic_09_BST;

// A BST can be constructed from preorder, postorder, or level-order traversal
// BST search complexity - O(H), H = tree height
// BST makes search efficient
public class BST {
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

    public static Node insert(Node root, int val) {
        if (root == null) {
            // root = new Node(val);
            // return root;
            return new Node(val);
        }

        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder traversal of BST gives a sorted sequence
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        // preorder
        int values[] = { 5, 3, 2, 1, 4, 6 };

        // for preorder or level order
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // for postorder
        // for (int i = values.length - 1; i >= 0; i--) {
        // root = insert(root, values[i]);
        // }

        inorder(root);
    }
}
