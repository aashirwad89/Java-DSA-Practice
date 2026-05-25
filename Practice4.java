import java.util.*;
public class Practice4 {
   public static void main(String[] args) {
    // Revision started 
    //Arrays ---

    // Find largest element 
    int arr[] = {5,6,7,8,32};
    int max = arr[0];

    for(int i = 0; i<arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    System.out.println(max);

    //kadanes algo 
    int arr2[] = {-2,-3,-1,4,3,2,1};

    int maxSum = arr[0];
    int currSum = 0;

    for(int i = 0; i<arr2.length; i++){
        currSum += i;
        maxSum = Math.max(maxSum, currSum);

        if(currSum <0){
            currSum = 0;
        }
    }
    System.out.println(maxSum);
   }
}
