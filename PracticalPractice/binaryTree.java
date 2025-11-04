package PracticalPractice;

public class binaryTree {
    static class Node{
        int data;
        Node right,left;

        public Node(int value){
            data = value;
            right=left=null;
        }
    }
    Node root;

    binaryTree(){
        root = null;
    }

    void preorderTraversal(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");

        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        binaryTree tree = new binaryTree();

        // Create nodes manually
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\nPreorder traversal:");
        tree.preorderTraversal(tree.root);
    }
}
