package PracticalPractice;

public class BinarySearchTree {
    static class Node{
        int data;
        Node right, left;

        public Node(int value){
            data = value;
            right = left = null;
        }
    }
    Node root;

    BinarySearchTree(){
        root = null;
    }

    Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(value<root.data){
            root.left = insert(root.left, value);
        } else if (value>=root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    Boolean search(Node root, int key){
        if(root == null){
            return false;
        } else if (root.data == key) {
            return true;
        } else if (root.data>key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert elements
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        // Print inorder traversal (sorted order)
        System.out.println("Inorder traversal of BST:");
        bst.Inorder(bst.root);

        // Search test
        System.out.println("\n\nSearching for 40: " + bst.search(bst.root, 40));
        System.out.println("Searching for 90: " + bst.search(bst.root, 90));
    }

}
