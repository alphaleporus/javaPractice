package PracticalPractice;

import java.util.Scanner;

class stackUsingLL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node top = null;

    void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(top + " Pushed into the stack!");
    }

    void pop(){
        if (top == null){
            System.out.println("Stack Underflow...");
            return;
        }
        System.out.println(top +" Popped out!");
        top = top.next;
    }

    void peek(){
        if(top == null){
            System.out.println("Stack empty!");
        }else {
            System.out.println(top + " Is the first element...");
        }
    }

    void display(){
        if(top == null){
            System.out.println("Stack empty!");
            return;
        }
        Node temp = top;
        System.out.println("Stack Elements: ");
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        stackUsingLL stack = new stackUsingLL();
        stack.push(20);
        stack.peek();
        stack.push(30);
        stack.push(10);
        stack.push(200);
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
        stack.pop();
        stack.pop();
        stack.peek();
    }
}