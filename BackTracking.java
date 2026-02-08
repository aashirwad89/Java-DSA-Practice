public class BackTracking {
public static void changeArr(int arr[], int i , int val){
    // base case 
if(i == arr.length){
    printArr(arr);
    return;
}

    // recursion
arr[i] = val;
changeArr(arr, i+1, val+1);
arr[i] = arr[i] - 2;
}

public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
}

public static void findSubset(String str, String ans , int Idx){
    // base case
    if(Idx == str.length()){
        if(ans.length() == 0){
            System.out.println("null");
        }else {
System.out.println(ans);
        }
        
        return; 
    }
    
    // recurison 
    // yes choice 
    findSubset(str, ans+str.charAt(Idx), Idx+1);
    // No choice 
    findSubset(str, ans, Idx+1);


}

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        // subsets of an string 
        String str  = "abc";
        findSubset(str, "", 0);

    }
}
