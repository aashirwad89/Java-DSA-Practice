public class Practice {

//     public static int printOcc(int[] arr, int key, int i){
//     //    base case
//     if(i == arr.length){
//         return i;
//     }

//     // work
//     if(arr[i]==key){
//         System.out.println(i);
//     }
//  return   printOcc(arr, key , i+1);
//      }


     public static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
     public static void printDigit(int number){
        if(number == 0){
            return;
        }

        int lastDigit = number%10;
        printDigit(number/10);
        System.out.println(digits[lastDigit]);
     }


public static int 
    

public static void main(String[] args) {
//  int[] arr = {3,2,4,5,6,2,7,2,2};
//  int key = 2;
//  System.out.println(printOcc(arr, key , 0));
printDigit(1234);

    
}
}
    
