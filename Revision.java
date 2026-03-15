public class Revision {

    public static int BSearch(int numbers[], int key){
int start = 0;
int end = numbers.length-1;

while(start <= end){
    int mid = (start + end)/2;

    // comparison
if(numbers[mid] == key){
    return mid;
}

if(numbers[mid] < key){
    start = mid+1;
}else{
    end = mid-1;
}
}
return -1;
    }


public static void reverseArray(int numbers[]){
    int first = 0;
    int last = numbers.length-1;

    while(first<last){
        // swap
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp;

        first ++;
        last--;
    }
}


    public static void main(String[] args) {
        // linear search 
        // int arr[] = {2,6,8,4,10};
        // int key = 10;

        // for(int i = 0; i<arr.length; i++){
        //     if(key == arr[i]){
        //         System.out.println("element got it");
        //     }else{
        //         System.err.println("element not found");
        //     }
        // }

        // // binary search 
        // int numbers[] = {2, 5, 8, 12, 16, 23, 38};
        // int key = 8;
        // System.out.println(BSearch(numbers, key));

        // reverse array
//         int numbers[] = {3,2,1,4};
// reverseArray(numbers);
// for(int i = 0; i<numbers.length; i++){
//     System.out.println(numbers[i]);
// }


// spiral matrix
int matrix[][] = [
    {1,2,3},
    {4,5,6},
    {7,8,9}
]





    }
}
