import java.util.*;
public class Greedy {
    static class Job{
int deadline;
int profit;
int id;

public Job(int i , int d , int p){
    id = i;
    deadline = d;
    profit = p;
}
}
    public static void main(String[] args) {
//         int start[] = {1,3,0,5,8,5};
//         int end[]= {2,4,6,7,9,9};

//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         maxAct = 1;
//         ans.add(0);
// int lastEnd = end[0];
//         for(int i = 1; i<end.length; i++){
//             if(start[i] >= lastEnd){
// // activity select
//               maxAct++;
//               ans.add(i);
//               lastEnd = end[i];
//             }
//         }

//         System.out.println(maxAct);
//         for(int i = 0; i<ans.size(); i++){
//             System.out.println(ans.get(i));
//         }

// int val[] = {60, 100 , 120};
// int weight[] = {10 , 20 , 30};
// int W = 50;

// double ratio[][] = new double[val.length][2];


// for(int i = 0; i< val.length; i++){
//     ratio[i][0] = i;
//     ratio[i][1] = val[i]/(double)weight[i];
// }

// Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));

// int capacity = W;
// int finalVal = 0;
// for(int i = ratio.length-1; i>=0; i--){
//     int idx = (int)ratio[i][0];
//  if(capacity >= weight[idx]){
// finalVal += val[idx];
// capacity -= weight[idx];
//  }else{
//     finalVal += (ratio[i][1] * capacity);
//     capacity = 0;
//     break;
//  }
// }
// System.out.println(finalVal);

// int A[] = {1,2,3};
// int B[] = {2,1,3};

// Arrays.sort(A);
// Arrays.sort(B);

// int minDiff = 0;

// for(int i = 0; i<A.length; i++){
//     minDiff += Math.abs(A[i]-B[i]);
// }
// System.out.println(minDiff);

// max length chain of pairs

// int pairs[][] = {{5,24}, {39,40},  {5,28}, {27,40}, {50,90}};

// Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));

// int chainL = 1;

// int pairEnd = pairs[0][1];

// for(int i = 1; i<pairs.length; i++){
//     if(pairs[i][0] > pairEnd){
//         chainL++;
//         pairEnd = pairs[i][1];
//     }
// }
// System.out.println(chainL);


// indian coins 
// Integer coins[] = {1,2,5,10,20,50,100,500,2000};
// Arrays.sort(coins, Comparator.reverseOrder());

// int countOfCoins = 0;
// int amount = 590;
// ArrayList<Integer> ans = new ArrayList<>();
// for(int i = 0; i<coins.length; i++){
//     if(coins[i] <= amount){
//         while(coins[i] <= amount){
//         countOfCoins++;
//         ans.add(coins[i]);
//         amount -= coins[i];
//     }
// }
// }
// System.out.println(countOfCoins);


//job sequencing problem 


// int jobsInfo[][] = {{1,20}, {1,10}, {1,40}, {1,30}};

// ArrayList<Job> jobs =  new ArrayList<>();

// for(int i = 0; i<jobsInfo.length; i++){
//     jobs.add( new Job(i , jobsInfo[i][0], jobsInfo[i][1]));
// }

// Collections.sort(jobs, (a,b)-> b.profit -a.profit);

// ArrayList<Integer> seq = new ArrayList<>();
// int time = 0;
// for(int i = 0; i<jobs.size(); i++){
//     Job curr = jobs.get(i);
//     if(curr.deadline > time){
//         seq.add(curr.id);
//         time++;
//     }
// }
// System.out.print(seq.size());     
// for(int i   = 0; i<seq.size(); i++){
//     System.out.print(seq.get(i));
// }


// chocola problem 
int n = 4; 
int m = 6; 
Integer costVer[] = {2,1,3,1,4};
Integer costHor[] = {4,1,2};

Arrays.sort(costVer, Collections.reverseOrder());
Arrays.sort(costHor , Collections.reverseOrder());

int h = 0 ;
int v= 0 ;
int hp = 0; 
int vp = 0;
int cost = 0;
while(h<costHor.length && v<costVer.length){
    // ver cost < hor cost 
    if(costVer[v]<= costHor[h]){
cost += (costHor[h]*vp);
hp++;
h++;
    }else{
        cost += (costVer[v] * hp );
        vp++;
        v++;
    }
}

while(h<costHor.length){
    cost += (costHor[v]*hp);

    hp++;
    h++;
}

while(v<costVer.length){
    cost += (costVer[v]*hp);
    vp++;
    v++;
}

System.out.println(cost);
}
}
