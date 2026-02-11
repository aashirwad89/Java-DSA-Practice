public class ImpArr {
public static void printSubArr(int numbers[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for(int i =0; i<numbers.length; i++){
        int start = i;
for(int j = 0; j<numbers.length; j++){
    int end = j;
    currSum = 0;
}
        for(int k = start; k<=end; k++){
            // subarray sum 
            currSum += numbers[k];
        }
        if(maxSum <currSum){
            maxSum = currSum;
        }
    }

    System.out.println(maxSum);
}

    public static void main(String[] args) {
        int numbers[] = {1,2,3,-2,6};
        printSubArr(numbers);
    }
}
