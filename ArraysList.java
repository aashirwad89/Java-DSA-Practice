import java.util.ArrayList;
import java.util.*;
public class ArraysList {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    // this is a bruteforce approach for most water
//     public static int storeWater(ArrayList<Integer> height){
// int maxWater = 0 ;
// for(int i=0; i<height.size(); i++){
//     for(int j = i+1; j<height.size(); j++){
//         int ht = Math.min(height.get(i), height.get(j));
//         int wd = j-i;
//         int currWater = ht*wd;
//         maxWater  = Math.max(maxWater, currWater);
//     }
// }

// return maxWater;
//     }
// 

// 2 pointer approach for most water contained
public static int storeWater(ArrayList<Integer> height){
int maxWater = 0;
int lp = 0;
int rp = height.size()-1;

while (lp<rp) {
    // calculate water area
    int hgt = Math.min(height.get(lp), height.get(rp));
    int wdt = rp-lp;
    int currWater = hgt * wdt;
    maxWater = Math.max(maxWater, currWater);

    // update ptr
    if(height.get(lp)< height.get(rp)){
        lp++;
    }else{
        rp--;
    }
}
return maxWater;
}

// brute force approach
// public static boolean pairSum(ArrayList<Integer> height, int target){

//     for(int i =0; i<=height.size(); i++){
//         for(int j = i+1; j<height.size(); j++){
//             if(height.get(i) + height.get(j) == target){
// return true;
//             }
//         }
//     }
//     return false;
// }

    // 2pointer approach - linear time complexity dega 
//     public static boolean pairSum(ArrayList<Integer> height, int target){
// int lp = 0;
// int rp = height.size()-1;

// while(lp != rp){
//     if(height.get(lp) + height.get(rp) == target){
//         return true;
//     }

//     if(height.get(lp)+height.get(rp) < target){
//         lp++;
//     }else{
//         rp--;
//     }
// }
// return false;
//     }

public static boolean pairSum(ArrayList<Integer> list , int target){
    int bp = -1;
    int n = list.size();
    for(int i =0; i<list.size(); i++){
        if(list.get(i) > list.get(i+1)){
            bp = i;
            break;
        }
    }
    int lp = bp+1; //smallest
    int rp = bp; //largest 

    while(lp != rp){
        if(list.get(lp) + list.get(rp) == target){
            return true;
        }
         if(list.get(lp) + list.get(rp) < target){
            lp = (lp+1) % n;
         }else{
            rp = (n+rp-1) % n;
         }
    }

    return false;
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
ArrayList<Integer> list = new ArrayList<>();
list.add(11);
list.add(15);
list.add(6);
list.add(8);
list.add(9);
list.add(10);

int target = 16;

System.out.println(pairSum(list, target));
// height.add(4);
// height.add(8);
// height.add(3);
// height.add(7);

// System.out.println(storeWater(height));

// pair sum -1 



    }
}
