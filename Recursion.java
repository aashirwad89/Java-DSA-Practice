public class Recursion {

public static int fact(int n){
if(n==0){
    return 1;
}

    int fm1 = fact(n-1);
    int fn = n*fact(n-1);
    return fn;
}

    // public static void printInc(int n){
    //   if(n==1){
    //     System.out.println(n);
    //     return;
    //   }
    //     printInc(n-1);
    //    System.out.println(n);
    // }

    //print numbers in decreasing way (n to 1)
    // public static void printDec(int n){
    //     if(n==1){
    //         System.out.println(1);
    //         return;
    //     }
    //     System.out.println(n);
    //     printDec(n-1);
    // }
    public static void main(String[] args) {
        int n = 5;
        // printDec(n);
        // printInc(n);
        System.out.println(fact(n));
    } 
}
