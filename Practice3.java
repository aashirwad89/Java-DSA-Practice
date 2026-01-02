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

    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
// String s = "ABCD";  
System.out.println(mergeSort(arr, 0, arr.length-1));
    
    }
}