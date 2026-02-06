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

// reversing an array 
int numbers[] = {3,4,53,2};
reverseArr(numbers);
for(int i: numbers){
    System.out.println(i);
}


    
    }
}