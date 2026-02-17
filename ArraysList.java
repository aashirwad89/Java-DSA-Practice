import java.util.ArrayList;
import java.util.*;
public class ArraysList {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    // this is a bruteforce approach for most water
    public static int storeWater(ArrayList<Integer> height){
int maxWater = 0 ;
for(int i=0; i<height.size(); i++){
    for(int j = i+1; j<height.size(); j++){
        int ht = Math.min(height.get(i), height.get(j));
        int wd = j-i;
        int currWater = ht*wd;
        maxWater  = Math.max(maxWater, currWater);
    }
}

return maxWater;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>(); 

        // // operations of arrayslist

        // list.add(1); //O(n)
        // list.add(2);
        // list.add(3);
        // System.out.println(list);

        // //get
        // int element = list.get(2);
        // System.out.println(element);

        // // delete
        // list.remove(0);
        // System.out.println(list);

        // // set
        // list.set(1,10);
        // System.out.println(list);

        // // contains 
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(2));

        // // size
        // System.out.println(list.size());

        // print reverse array
        // ArrayList<Integer> list = new ArrayList();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // // reverse 
        // for(int i = list.size()-1; i>=0; i--){
        //     System.out.println(list.get(i));
        // }
        // System.out.println();  
        
        // find max
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
        //     if(max < list.get(i)){
        //         max = list.get(i);
        //     }
        // }
        // System.out.println(max);


        // swap two numbers
        // int idx1 = 1;
        // int idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

//         Collections.sort(list);
//         System.out.println(list);
//         Collections.sort(list, Collections.reverseOrder());
// System.out.println(list);


// 
// ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
// ArrayList<Integer> list = new ArrayList<>();
// list.add(1);
// list.add(2);
// mainList.add(list);
// ArrayList<Integer> list2 = new ArrayList<>();
// list2.add(3);
// list2.add(6);
// mainList.add(list2);

// System.out.println(mainList);


// container with most water - with brute force approach 
ArrayList<Integer> height = new ArrayList<>();
height.add(1);
height.add(8);
height.add(6);
height.add(2);
height.add(5);
height.add(4);
height.add(8);
height.add(3);
height.add(7);

System.out.println(storeWater(height));
    }
}
