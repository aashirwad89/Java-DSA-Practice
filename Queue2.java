import java.util.*;
public class Queue2 {

//     public static void interLeave(Queue<Integer> q){
// Queue<Integer> firstHalf = new LinkedList<>();
// int size = q.size();

// for(int i = 0; i<size/2; i++){
// firstHalf.add(q.remove());
// }

// while(!firstHalf.isEmpty()){
//     q.add(firstHalf.remove());
//     q.add(q.remove());
// }
//     }

//     public static void reverse(Queue<Integer> q){
//         Stack<Integer> s = new Stack<>();
//         while(!q.isEmpty()){
//             s.push(q.remove());
//         }

//         while(!s.isEmpty()){
//             q.add(s.pop());
//         }
//     } 


    static class Stack2{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
           return deque.removeLast();
        }

        public int peek(){
            return deque.getLast();
        }
    }

    static class Queue3{
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.add(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {

        // Stack2 s = new Stack2();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println(s.peek());

        // System.out.println(s.pop());

        Queue3 q = new Queue3();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());
        System.out.println(q.remove());
        
    //  Deque<Integer> deque = new LinkedList<>();
    //  deque.addFirst(1);
    //  deque.addFirst(2);
    //  System.out.println(deque);

    // Queue<Integer> q = new LinkedList<>();
    // q.add(1);
    // q.add(2);
    // q.add(3);    
    // q.add(4);    
    // q.add(5);  
    
    // reverse(q);
    // while(!q.isEmpty()){
    //     System.out.print(q.remove() + " ");
    // }
    // System.out.println();
    // q.add(6);    
    // q.add(7);    
    // q.add(8);    
    // q.add(9);    
    // q.add(10);    
       
//     interLeave(q);
//     // print 
// while(!q.isEmpty()){
//     System.out.print(q.remove() + " ");
// }
// System.out.println();


    }
}
