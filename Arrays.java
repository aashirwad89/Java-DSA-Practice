public class Arrays {


//     public static int linearSearch(int numbers[] , int key){
// for(int i = 0 ;  i<numbers.length; i++){
//     if( numbers[i] == key ){
//         return i;
//     }

// }
// return -1;

//     }



// binary search 
// public static int binarySearch(int numbers[], int key){
//     int start = 0 ;
//     int end = numbers.length-1;
//     while(start <= end){
//     int mid  = (start+end)/2;
//     // comparison 
//     if(numbers[mid] == key){
//         return mid;
//     }
//     if(numbers[mid]< key){
//         start = mid+1;
//     }else{
//         end = mid-1;
//     }
//     }
//     return -1;
// } 

// reverse an array 
public static void reverseArray(int numbers[]){
int first = 0;
int last = numbers.length-1;

while(first<last){
    // swap
    int temp = numbers[last];
    numbers[last] = numbers[first];
    numbers[first] = temp;

    first++;
    last --;

}
}



    public static void main(String[] args) {
     //linear search 
     int numbers[] = {2,4,5,6,78,10,12};
    //  int key = 10; 
     
    //  System.out.println(linearSearch(numbers, key));
// System.out.println(binarySearch(numbers, key));

reverseArray(numbers);
for(int i = 0; i<numbers.length; i++){
    System.out.print(numbers[i] + " ");
}
System.out.println();

    }
}