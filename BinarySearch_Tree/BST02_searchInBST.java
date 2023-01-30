
package BinarySearch_Tree;

public class BST02_searchInBST {

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

    Node insertbts(Node root, int valu) {
        if (root == null) {
            root = new Node(valu);
            return root;
        }

        if (root.data > valu) {
            root.left = insertbts(root.left, valu);
        } else {
            root.right = insertbts(root.right, valu);
        }

        return root;
    }

    Node buildTree(Node root, int values[]) {
        for (int i = 0; i < values.length; i++) {
            root = insertbts(root, values[i]);
        }
        return root;
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    boolean Searching(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return Searching(root.left, key);
        } else {
            return Searching(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };

        BST02_searchInBST tree = new BST02_searchInBST();
        Node root = tree.buildTree(null, values);
        tree.inorder(root);
        // System.out.println(tree.Searching(root, 7));

    }
}