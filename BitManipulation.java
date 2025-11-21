// public class BitManipulation {
//     public static void oddEven(int n){
//         int bitMask = 1;
//         if((n & bitMask) == 0){
//             // even
//             System.out.println("Even number");
//         }else{
//             System.out.println("Odd number");
//         }
//     }
    
//     public static int getIth(int n , int i){
//         int bitMask = 1<<i;
//         if((n & bitMask) == 0){
//             return 0;
//         }else{
//             return 1;
//         }
//     }

//     public static int setIth(int n , int i){
//         int bitMask = 1<<i;
//         return n | bitMask;
//     }

//     public static int clearIth(int n , int i){
//         int bitMask = ~(1<<i);
//         return n & bitMask;
//     }
    
//     public static void main(String[] args) {
//         // check number is odd or even 
// // oddEven(3);
// // oddEven(11);
// // oddEven(2);

// // System.out.println(getIth(10, 3));
// // System.out.println(setIth(10, 2));

// System.out.println(clearIth(10, 1));
//     }
// }
