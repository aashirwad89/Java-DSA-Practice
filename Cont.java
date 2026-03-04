public class Cont {
    
    public static String findLargest(String[] arr){
if(arr.length == 0){
  throw new IllegalArgumentException("No strings provided");
}      

String max = arr[0];
for(int i=1; i<arr.length; i++){
  if(arr[i].compareTo(max)>0){
    max = arr[i];
  }
}
return max;
    }
    
    public static void main(String[] args) {
    String[] arr = {"Appple", "Bananna", "Mango", "Orange"};
    String largest = findLargest(arr);
    System.out.println(largest);  
    }
}