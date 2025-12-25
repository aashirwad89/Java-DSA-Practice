public class Divide {
// public static void printArr(int arr[]){
//     for(int i=0; i<arr.length; i++){
//         System.out.println(arr[i]);
//     }
//     System.out.println();
// }
// public static void mergeSort(int arr[], int si , int ei){
// // base case
// if(si>=ei){
//     return;
// }

//     // work 
//     int mid = (si+ei)/2 ; 
//     mergeSort(arr, si, mid);  //left side
//     mergeSort(arr, mid+1, ei); //right side
// merge(arr, si , mid , ei);
// }
// public static void merge(int arr[], int si , int mid , int ei){
// int temp[] = new int[ei-si+1];
// int i = si; //iterator for left part
// int j = mid+1; //iterator for right part
// int k = 0; //iterator for temp array


// while(i<=mid && j<=ei){
//     if(arr[i]<arr[j]){
//         temp[k] = arr[i];
//         i++;
//     }else{
//         temp[k] = arr[j];
//         j++;
//     }
//     k++;
// }
// // left part
// while(i<=mid){
//     temp[k++] = arr[i++];   
// }

// // right part 
// while(j<=ei){
//     temp[k++] = arr[j++];
// }

// // copy temp to original arr
// for( k=0,  i=si; k<temp.length; k++, i++){
//     arr[i] = temp[k];
// }
// }

// Quick Sort 

// public static void printArr(int arr[]){
//     for(int i=0; i<arr.length; i++){
//         System.out.println(arr[i]);
//     }
//     System.out.println();
// }
  
// public static void quickSort(int arr[], int si , int ei){
// // base case
// if(si>=ei)
// {
// return;
// }
// // pivot - lat element
// int piIdx = partition(arr, si , ei);

// quickSort(arr, si, piIdx-1); //left part
// quickSort(arr, piIdx+1, ei); //right part 

// }
// public static int partition(int arr[], int si , int ei){
// int pivot = ei;
// int i= si-1;

// for(int j =si; j<ei; j++){
//     if(arr[j]<= pivot){
//         i++;
//         // swap 
//         int temp = arr[j];
//         arr[j] = arr[i];
//         arr[i] = temp;
//     }
// }

// i++;
// int temp = pivot;
// arr[ei] = arr[i];
// arr[i] = temp;
// return i;

// }


// Search in rotated sorted array
public static int search(int arr[], int target , int si , int ei){
// base case 
if(si>ei){
    return -1;
}

    // kaam

int mid = (si+ei)/2 ;

// case a
if(arr[mid]== target){
    return mid;
}

// mid - L1

if(arr[si]<= arr[mid]){
if(arr[si]<=target && target<=arr[ei]){
   return search(arr, target, si, mid-1);
}else{
    // case b
    return search(arr, target, mid+1, ei);
}
}else{
// case c
if(arr[mid]<=target && target <= arr[ei]){
    return search(arr, target, mid+1, ei);
}else{
    // case d
    return search(arr, target, si, mid-1);
}
}
} 


    public static void main(String[] args) {
//         int arr[] = {6,3,9,5,2,8};
// mergeSort(arr, 0, arr.length-1);
// printArr(arr);

// int arr[] = {6,4,3,2,5};
// quickSort(arr, 0, arr.length-1);
// printArr(arr);

// Scanner sc = new Scanner(System.in)

int arr[] = {4,5,6,7,0,1,2};
int target = 0;
int tarIdx = search(arr, target, 0, arr.length-1);
System.out.println(tarIdx);
    }
}
