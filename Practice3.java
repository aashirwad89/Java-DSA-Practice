import java.lang.reflect.Array;
import java.util.*;
public class Practice3{

// public static String toLower(String s){
//     String lower = s.toLowerCase();
// }

public static void mergeSort(String arr[], int si , int ei){
    if(si>=ei){
        return;
    }
    int mid = si+(ei-si)/2;

    mergeSort(arr, si, mid);
    mergeSort(arr, mid+1, ei);

    merge(arr, si, mid, ei);
}    
public static void merge(String arr[], int si , int mid , int ei){
    String[] temp = new String[ei-si+1];
    int i = si;
    int j = mid+1;
    int k = 0;


    while(i<=mid && j<=ei){
        if(arr[i].compareTo(arr[j])<=0){
            temp[k++] = arr[i++];
        }else{
            temp[k++] = arr[j++];
        }
    }

    while(i<=mid){
        temp[k++] = arr[i++];
    }

    while(j<=ei){
        temp[k++] = arr[j++];
    }

    for(int x =0; x<temp.length ; x++){
        arr[si+x] = temp[x];
    }
}

public static int Bsearch(int num[], int key){
    int start = 0;
    int end = num.length-1;

    while(start<= end){
        int mid = (start+end)/2;

        if(num[mid] == key){
        return mid;
    }

    if(num[mid] <  key){
        start = mid+1;
    }else{
        end = mid-1;
    }
   

    }
     return -1;
}

public static void reverseArr(int numbers[]){
    int first = 0;
    int last = numbers.length-1;
     int temp;

    while(first<last){
        temp = numbers[first];
        // swap
        numbers[last] = numbers[first];
        numbers[last] = temp;

        first++;
        last--;
    }
}

public static void bubbleSort(int arr[]){

    int n = arr.length;
for(int i=0; i<n-1; i++){
    for(int j=0; j<n-1-i; j++){
        if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
}

public static void selectionSort(int arr[]){
    int n = arr.length;
    for(int i=0; i<n-1; i++){
int minIdx = i;

for(int j=i+1; j<n; j++){
    if(arr[j]<arr[minIdx]){
        minIdx = j;
    }
}
// swap 
int temp = arr[minIdx];
arr[minIdx] = arr[i];
arr[i] = temp;
    }
}

public static void insertionSort(int arr[]){
    int n = arr.length;
for(int i=0; i<n; i++){
    int key = arr[i];
    int j = i-1;

    while(j>=0 && arr[j]>key){
        arr[j+1] = arr[j];
        j--;
    }

    arr[j+1] = key;
}

}

public static void printSpiral(int matrix[][]) {

    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length - 1;
    int endCol = matrix[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {

        // top
        for (int j = startCol; j <= endCol; j++) {
            System.out.print(matrix[startRow][j] + " ");
        }

        // right
        for (int i = startRow + 1; i <= endRow; i++) {
            System.out.print(matrix[i][endCol] + " ");
        }

        // bottom
        if (startRow < endRow) {
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");
            }
        }

        // left
        if (startCol < endCol) {
            for (int i = endRow - 1; i > startRow; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }
        }

        startRow++;
        startCol++;
        endRow--;
        endCol--;
    }
}

public static boolean isPalindrome(String str){
    int start = 0;
    int end = str.length()-1;

    while(start<end){
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
}
    public static void main(String[] args) {
//         String arr[] = {"sun", "earth", "mars", "mercury"};
// // String s = "ABCD";  
// System.out.println(mergeSort(arr, 0, arr.length-1));

// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// float b = sc.nextFloat();
// long c = sc.nextLong();
// byte d = sc.nextByte();
// StringBuilder s = sc.nextLine();

// System.out.println(a);
// System.out.println(b);
// System.out.println(c);
// System.out.println(d);
// System.out.println(s);

// binary search for indexing an array 

// int num[] = {2,3,4,5,6,10,12};
// int key = 10;

// System.out.println(Bsearch(num, key));

// // reversing an array 
// int numbers[] = {3,4,53,2};
// reverseArr(numbers);
// for(int i: numbers){
//     System.out.println(i);
// }

// int arr[] = {5,4,1,3,2};
// bubbleSort(arr);
// for(int num:arr){
//     System.out.println(num);
// }

// selection sort 
// int arr[] = {5,4,2,3,1};

// selectionSort(arr);
// for(int num : arr){
//     System.out.println(num);
// }

// insertion sort 
// int arr[] = {5,4,2,3,1};

// insertionSort(arr);
// for(int num:arr){
//     System.out.println(num);
// }

// // inbuilt sort 
// int arr[] = {5,4,2,1,3};
// Arrays.sort(arr);
// System.out.println(arr);

// int matrix[][] = {
//     {1,2,3,4},
//     {5,6,7,8},
//     {9,10,11,12}
// };
//     printSpiral(matrix);

    String str = "noon";
    if(isPalindrome(str)){
        System.out.println("palindrome hai");
    }else{
        System.out.println("palindrom nahi hai");
    }


    
    }
}