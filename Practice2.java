public class Practice2 {

public static boolean isEven(int n){
    return n % 2 == 0;
}

public static int numMax(int a , int b){
    if(a<b){
        return b;
    }else{
        return a;
    }
}

public static int printFact(int n , int fact){
    for(int i=1; i<=n; i++ ){
fact *= i;
    }
    return fact;
}



    public static void main(String[] args) {
        // int sum = 0;
        // int n = 5;
        // for(int i =0; i<=n; i++){
        //     sum += i;
        // }
        // System.out.println(sum);

        // int n = 5;
        // int fact = 1;
        // for(int i=1; i<=n; i++){
        //     fact *= i;
        // }
        // System.out.println(fact);


        // int n = 12345;
        // int count = 0;
        // while(n!=0){
        //     count++;
        //     n /= 10;
        // }
        // System.out.println(count);
// System.out.println(isEven(10));

// System.out.println(numMax(5, 2));

// System.out.println(printFact(5, 1));

// int arr[] = {2,3,4,5,6};
// int sum = 0;

// for(int i=0; i<arr.length; i++){
//     sum += arr[i];
// }
// System.out.println(sum);

// int arr[] = {2,3,4,5,6};
// int max = arr[0];

// for(int i =0; i<arr.length; i++){
//     if(arr[i] > max){
//         max = arr[i];
//     }
// }
// System.out.println(max);

int arr[] = {2,3,4,5,6};

for(int i= arr.length-1; i>=0; i--){
    System.out.println(arr[i]);
}

    }
}
