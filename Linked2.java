import java.util.LinkedList;
class Linked2 {



    // static class Node {
    //     int data;
    //     Node next;

    //     Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // static Node head;

    // public static boolean isCycle() {
    //     Node slow = head;
    //     Node fast = head;

    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;

    //         if (slow == fast) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public static void removeCycle(){
    //     Node slow = head;
    //     Node fast = head;
    //     boolean cycle = false;
    //     while(fast != null && fast.next != null){
    //         slow =  slow.next;
    //         fast = fast.next.next;

    //         if(fast == slow){
    //      cycle = true;
    //            break;
    //         }
    //     }

    //     if(cycle == false){
    //         return;
    //     }

    //  slow = head;
    // Node prev = null;
    // while(slow != fast){
    //     prev = fast;
    //     slow = slow.next;
    //     fast = fast.next;
    // }

    // prev.next = null;
    // }

    public static void main(String[] args) {
        // head = new Node(1);
        // head.next = new Node(2);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);

        // // cycle create
        // head.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());


        // creating a LL using JCF instead of using int , boolean , flaot we use the major clasess which are Integer , Boolean , Float
        LinkedList<Integer> ll = new LinkedList<>();

        // add elements
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

            System.out.println(ll);

            // remove
            ll.removeLast();
            System.out.println(ll);

    }
}