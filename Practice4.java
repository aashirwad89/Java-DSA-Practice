import java.util.*;
public class Practice4 {
   public static void main(String[] args) {
    // Revision started 
    //Arrays ---

    // Find largest element 
    // int arr[] = {5,6,7,8,32};
    // int max = arr[0];

    // for(int i = 0; i<arr.length; i++){
    //     if(arr[i]>max){
    //         max = arr[i];
    //     }
    // }
    // System.out.println(max);

    // //kadanes algo 
    // int arr2[] = {-2,-3,-1,4,3,2,1};

    // int maxSum = arr[0];
    // int currSum = 0;

    // for(int i = 0; i<arr2.length; i++){
    //     currSum += i;
    //     maxSum = Math.max(maxSum, currSum);

    //     if(currSum <0){
    //         currSum = 0;
    //     }
    // }
    // System.out.println(maxSum);


    //Strings ----

    //reverse a string 
    String str = "hello";
    String rev = "";

    for(int i = str.length()-1; i>=0; i--){
        rev += str.charAt(i);
    }
    System.out.println(rev);


    //check palindrome strings - two pointers 
    String str2 = "radar";

    int start = 0;
    int end = str2.length()-1;

    boolean isPalindrome = true;

    while(start<end){
        if(str2.charAt(start)!=str2.charAt(end)){
            isPalindrome  = false;
            break;
        }
        start++;
        end--;
    }
    System.out.println(isPalindrome);
   }
}
