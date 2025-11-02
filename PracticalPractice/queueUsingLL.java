package PracticalPractice;

public class queueUsingLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node front, rear;

    queueUsingLL(){
        front = rear = null;
    }

    void enqueue(int value){
        Node newNode = new Node(value);

        if(rear==null){
            front=rear=newNode;
            System.out.println(value + " Enqueued!");
            return;
        }

        rear.next = newNode;
        rear = newNode;
        System.out.println(value + " Enqueued!");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue underflow...");
            return;
        }

        System.out.println(front.data + " Dequeued!");
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    void display(){
        if(front == null){
            System.out.println("Queue Empty...");
            return;
        }
        Node temp = front;
        System.out.println("Queue Element: ");
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        queueUsingLL queue = new queueUsingLL();
        queue.display();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();

    }
}
