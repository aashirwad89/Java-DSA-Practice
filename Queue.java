import java.util.*;

public class QueueB {
//     static class Node{
//         int data;
//          Node next;

//          Node(int data){
//             this.data = data;
//             this.next = null;
//          }
//     }
//     static class QueueB{
// static Node head = null;
// static Node tail = null;



// public static boolean isEmpty(){
//   return head == null && tail == null;
// }

// // add function
// public static void add(int data){
//    Node newNode = new Node(data);
//    if(head == null){
//     head = tail = newNode;
//     return;
//    } 
//    tail.next = newNode;
//    tail = newNode;
// }

// // remove 
// public static int remove(){
//     if(isEmpty()){
//         System.out.println("empty queue");
//         return -1;
//     }
//        int front = head.data;
//        if(tail == head){
// tail = head = null;
//        }else{
//         head = head.next;
//        }
//        return front;
// }

// // peek 
// public static int peek(){
//     if(isEmpty()){
//         System.out.println("empty queue");
//         return -1;
//     }

//     return head.data;
// }
//     }

// static class QueueB{
//     static Stack<Integer> s1 = new Stack<>();
//     static Stack<Integer> s2 = new Stack<>();

//     public static boolean isEmpty(){
//         return s1.isEmpty();
//     }
//     // add
//     public static void add(int data){
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());
//         }
//         s1.push(data);

//         while(!s2.isEmpty()){
//             s1.push(s2.pop());
//         }
//     }

//     // remove
//     public static int remove(){
//         if(isEmpty()){
//             System.out.println("queue is empty");
//             return -1;
//         }

//         return s1.pop();
//     }

//     // peek
//     public static int peek(){
//         if(isEmpty()){
//             System.out.println("queue is empty");
//             return -1;
//         }

//         return s1.peek();

//             }
// }
  static class Stack{
static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    public static void push(int data) {
        if (!q1.isEmpty()) {
            q1.add(data);
        } else {
            q2.add(data);
        }
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("empty stack");
            return -1;
        }

        int top = -1;

        if (!q1.isEmpty()) {
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            top = q1.remove(); // last element
        } else {
            while (q2.size() > 1) {
                q1.add(q2.remove());
            }
            top = q2.remove();
        }

        return top;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("empty stack");
            return -1;
        }

        int top = -1;

        if (!q1.isEmpty()) {
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            top = q1.remove();
            q2.add(top); // put it back
        } else {
            while (q2.size() > 1) {
                q1.add(q2.remove());
            }
            top = q2.remove();
            q1.add(top);
        }

        return top;
    }
}
public static void main(String[] args) {
        // QueueB q = new QueueB();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // System.out.println(q.remove());
        // q.add(4);
        // System.out.println(q.remove());
        // q.add(5);
        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

// QueueB q = new QueueB();
// q.add(1);
// q.add(2);
// q.add(3);

// while(!q.isEmpty()){
//     System.out.println(q.peek());
//     q.remove();
// }


Stack s = new Stack();
s.push(1);
s.push(2);
s.push(3);

while(!s.isEmpty()){
    System.out.println(s.peek());
    s.pop();
}
    }
}
