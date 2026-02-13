

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

public static int trappedWater(int height[]){
    // calculate left max boundary - array
    int leftMax[] = new int[height.length];
    leftMax[0] = height[0];
    for(int i = 1; i<height.length; i++){
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }
    

// calculate right max boundary - array
int rightMax[] = new int[height.length];
rightMax[height.length-1] = height[height.length-1];
for(int i = height.length-2; i>=0; i--){
rightMax[i] = Math.max(height[i], rightMax[i+1]);
}


int trappedWater = 0;
// loop
for(int i=0; i<height.length; i++){
 //water level = min(leftMax bound , rightMax bound)
 int waterLevel = Math.min(leftMax[i], rightMax[i]);
 // trapped water = waterLevel - height 
trappedWater += waterLevel -height[i];
}

return trappedWater;
}

public static int buyAndSell(int prices[]){
    int buyPrice = Integer.MAX_VALUE ; //iska matlab hai infinity se initialise krna 
    int maxProfit = 0;

    for(int i=0; i<prices.length; i++){
        if(buyPrice < prices[i]){
            int profit  = prices[i]-buyPrice;
            maxProfit = Math.max(maxProfit, profit);
        }else{
            buyPrice = prices[i];
        }
    }

    return maxProfit;
}

    public static void main(String[] args) {
        // int numbers[] = {1,2,3,-2,6};
        // printSubArr(numbers);
        // printPrefixArr(numbers);
        // kandanes(numbers);

        // trapped Rainwater
//         int height[] = {4,2,0,6,3,2,5};
// System.out.println(trappedWater(height));

// best time to buy or sell stocks
int prices[] = {7,1,5,3,6,4};
System.out.println(buyAndSell(prices));

    }
}
