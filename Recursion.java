
public class Recursion {

public static int fact(int n){
if(n==0){
    return 1;
}

    int fm1 = fact(n-1);
    int fn = n*fact(n-1);
    return fn;
}

    // public static void printInc(int n){
    //   if(n==1){
    //     System.out.println(n);
    //     return;
    //   }
    //     printInc(n-1);
    //    System.out.println(n);
    // }

    //print numbers in decreasing way (n to 1)
    // public static void printDec(int n){
    //     if(n==1){
    //         System.out.println(1);
    //         return;
    //     }
    //     System.out.println(n);
    //     printDec(n-1);
    // }

    // print sum of n natural numbers 
//      public static int printNat(int n){
// if(n == 1){
//     return 1;
// }

//         int Sm1 = printNat(n-1);
//         int Sn = n + Sm1;
//         return Sn;
//      }

//Print n numbers using fibonacci series 
// public static int printFib(int n){
//     if( n==0 || n==1){
//         return n;
//     }
//     int fn1 = printFib(n-1);
//     int fn2 = printFib(n-2);

//     int fn = fn1 + fn2;
//     return fn;
// }


// // print the array is sorted or not 
// public static boolean isSorted(int[] arr, int i){
//     if(i == arr.length-1){
//         return true;
//     }
// if(arr[i]>arr[i+1]){
//     return false;
// }
// return isSorted(arr, i+1);
// }

// WAF to find the occurence of an element in an array
// public static int printOcc(int arr[], int key, int i){
//     if(i==arr.length){
//         return -1;
//     }
// if(arr[i]== key){
//     return i;
// }
// return printOcc(arr, key, i+1);

// }

// public static int lastOccurence(int arr[], int key, int i){
//     if(i==arr.length){
//         return -1;
//     }
//     int isFound = lastOccurence(arr, key, i+1);
//     if(isFound == -1 && arr[i] == key){
//         return i;
//     }

//     return isFound;
// }

// print x^n 
// public static int powerPrint(int x , int n ){
//     if(n==0){
//         return 1;
//     }
//     return x*powerPrint(x, n-1);
// }





    public static void main(String[] args) {
//         int arr[] = {8,2,7,5,8,9,3,5};
// System.out.println(lastOccurence(arr, 5, 0));
System.out.println(powerPrint(2, 10));

        // System.out.println(printOcc(arr, 5, 0));
        // System.out.println(isSorted(arr, 0));
//         int n = 10;
//         // System.out.println(printNat(n));
// System.out.println(printFib(n));
        // int n = 5;
        // // printDec(n);
        // // printInc(n);
        // System.out.println(fact(n));
    } 
}
