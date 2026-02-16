import java.util.ArrayList;
public class ArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 

        // operations of arrayslist

        list.add(1); //O(n)
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get
        int element = list.get(2);
        System.out.println(element);

        // delete
        list.remove(0);
        System.out.println(list);

        // set
        list.set(1,10);
        System.out.println(list);

        // contains 
        System.out.println(list.contains(1));
        System.out.println(list.contains(2));
    }
}
