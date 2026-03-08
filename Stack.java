import java.util.*;
public class Stack {
    static class StackB{
stativ ArrayList<Integer> list = new ArrayList();
public static boolean isEmpty(){
    return list.size == 0;
}

// push function
public static void push(int data){
    list.add(data);
}

// pop function
public static int pop(){
    int top = list.get(list.size()-1);
    list.remove(list.size()-1);
    return top;
}

// peek operation
public static int peek(){
    int top = list.get(list.size()-1);
}
    }
    public static void main(String[] args) {
        
    }
}
