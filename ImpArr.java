

public class ImpArr {

    // Normal life code
public static void printSubArr(int numbers[]){
    int maxSum = Integer.MIN_VALUE;

    for(int i = 0; i < numbers.length; i++){
        for(int j = i; j < numbers.length; j++){
            int currSum = 0;

            for(int k = i; k <= j; k++){
                currSum += numbers[k];
            }

            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
    }

    System.out.println(maxSum);
}

// prefix way to do max subarray sum question 
public static void printPrefixArr(int numbers[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];
prefix[0]  = numbers[0];
// calculate prefix array 
for(int i= 1; i<prefix.length; i++){
prefix[i] = prefix[i-1] + numbers[i];
}

    for(int i=0; i<numbers.length; i++){
        int start = i;
        for(int j = 0; j<numbers.length; j++){
            int end = j;
            currSum  = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

            System.out.println(currSum);

                if(maxSum  < currSum){
                    maxSum = currSum;
                }
        }
    }
    System.out.println(maxSum);
}

// kandane's algo approach 
public static void kandanes(int numbers[]){
     int maxSum = Integer.MIN_VALUE;
     int cs = 0;

for(int i =0; i<numbers.length; i++){
    cs = cs + numbers[i];
    if(cs < 0){
        cs = 0;
    }
    maxSum = Math.max(cs, maxSum);
}
System.out.println(maxSum);
}
    public static void main(String[] args) {
        int numbers[] = {1,2,3,-2,6};
        // printSubArr(numbers);
        // printPrefixArr(numbers);
        kandanes(numbers);
    }
}
