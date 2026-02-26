public class Linked {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Add at index
    public void add(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }

        size++;
    }

    // Remove first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;
        head = head.next;
        size--;

        if (size == 0) {
            tail = null;
        }

        return val;
    }

    // Remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;

        return val;
    }


    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx  = helper(head.next, key);
        if(idx == -1){
return -1;
        }

        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

public int itrSearch(int key){
    Node temp = head;
    int i = 0;

    while(temp != null){
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
    }

    return -1;

}

public void reverse(){
    Node prev = null;
    Node curr = tail =  head; //right to left value assign hoti hai
Node next;

while( curr != null){
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
}
head = prev;
}

    // Print list
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Get size
    public int getSize() {
        return size;
    }

    // Main method
    public static void main(String[] args) {

        Linked ll = new Linked();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);

        ll.print();   // 2 -> 1 -> 9 -> 3 -> 4 -> null

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        ll.reverse();
        ll.print();

        
// System.out.println(ll.recSearch(3));
        // System.out.println(ll.itrSearch(3));
        // System.out.println("Size: " + ll.getSize());
    }
}