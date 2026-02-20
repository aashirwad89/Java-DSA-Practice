import java.util.*;

public class Linked {
public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public static Node head;
public static Node tail;

public void addFirst(int data){
    // step 1
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;
    }

    // step 2 
    newNode.next = head;

    // step 3 
head = newNode;
}
public void addLast(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
}

public void print(){
    if(head == null){
        System.out.println("LL is empty");
        return;
    }
Node temp = head;
while(temp!=null){
    System.out.println(temp.data + " ");
    temp = temp.next;
}
System.out.println();
}
public static void main(String[] args) {
LinkedList ll = new LinkedList<>();
ll.print();
ll.addFirst(1);
ll.addFirst(2);
ll.print();
ll.addLast(3);
ll.addLast(4);
ll.print();




// we didn't add direct things into linked list instead of that we use methods just like add , remove , print for the linked lists 
// ll.head = new Node(1);
// ll.head.next  = new Node(2);

}
}
