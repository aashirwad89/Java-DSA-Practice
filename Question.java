import java.util.*;
public class Question {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// // // //         // avg of 3 number 
// // // //         // int a = sc.nextInt();
// // // //         // int b = sc.nextInt();
// // // //         // int c = sc.nextInt();
// // // //         // System.out.println((a+b+c)/3);


// // // //         // side square 
// // // //         // int a = sc.nextInt();
// // // //         // System.out.println(a*a);


// // // //         // billing problem
// // // // //         float pencil = 23.4f;
// // // // //         float pen = 44.4f;
// // // // //         float erase = 10.2f;
// // // // //         float gstPrice  = 18.0f;
// // // // //            float finalPrice = pencil + pen + erase;
// // // // //            float priceOutput = (finalPrice*gstPrice)/100 ;
// // // // // System.out.println(priceOutput);


// // // // // // type checker 
// // // // // byte b = 4;
// // // // // char c = 'a';
// // // // // short s = 512;
// // // // // int i = 100;
// // // // // float f = 3.14f;
// // // // // double d = 99.54;
// // // // //  var result = (f*b) + (i / c) - (d*s);
// // // // // System.out.println(result);


// // // // calculator using switch statments 
// // // // int a = sc.nextInt();
// // // // int b = sc.nextInt();
// // // // char operator = sc.next().charAt(0);
// // // // switch(operator){
// // // //     case '+' : System.out.println(a+b);
// // // //     break;
// // // //     case '-' : System.out.println(a-b);
// // // //     break;
// // // //     case '*' : System.out.println(a*b);
// // // //     break;
// // // //     case '/' : System.out.println(a/b);
// // // //     break;
// // // //     default: System.out.println("set corret value");
// // // // }

// // // // // question to print pos and neg
// // // // int n = sc.nextInt();
// // // // String checkNum = ((n>=0))? "positive" : "negative";
// // // // System.out.println(checkNum);

// // // // temprature check 
// // // // double temp = 97.5;
// // // // String checkTemp = ((temp>100))? "Fever" : "Normal condition";
// // // // System.out.println(checkTemp);

// // // // int number = 5;
// // // // switch(number){
// // // //     case 1 : System.out.println("monday");
// // // //     break;
// // // //     case 2 : System.out.println("Tuesday");
// // // //     break;
// // // //     case 3 : System.out.println("wednesday");
// // // //     break;
// // // //     case 4: System.out.println("thursday");
// // // //     break;
// // // //     case 5 : System.out.println("friday");
// // // //     break;
// // // //     case 6 : System.out.println("saturday");
// // // //     break;
// // // //     case 7 : System.out.println("sunday");
// // // //     break;

// // // //     default: System.out.println("set again");
// // // // }


// // // // int a = 63 , b = 36;
// // // // boolean x =  (a<b) ? true : false;
// // // // int y = (a>b) ? a:b;
// // // // System.out.println(x);
// // // // System.out.println(y);

// // // question to check output 
// // // for(int i=0; i<5; i++){
// // //     System.out.println("Hello");
// // //     i += 2;
// // // }
// //  int n = sc.nextInt();
// //  for(int i =0; i i--){
// //     System.out.println(n);
// //  }

// // trapped water code 

// public static int trapRain(int height[]){
//     int n = height.length;
//     //calculate the left max boundary - array 
//     int leftMax[] = new int[n];
//     leftMax[0] = height[0];
//     for(int i = 1; i<n; i++){
//         leftMax[i] = Math.max(height[i], leftMax[i-1]);
//     }

//     //calculate the right max boundary - array 
//     int rightMax[] = new int[n];
//     rightMax[n-1] = height[n-1];
//     for(int i =n-2; i>=0; i--){
// rightMax[i] = Math.max(height[i], rightMax[i+1]);
//     }

//     int trapWater = 0;
//     ///loop
//     for(int i = 0; i<n; i++){
//         int waterLevel = Math.min(leftMax[i], rightMax[i]);
//         trapWater += waterLevel - height[i];
//     }
//     return trapWater;
// }
// public static void main(String[] args) {
//     int height [] = {4,5,6,7,3,2,1,3};
//     System.out.println(trapRain(height));
// }

public static void  reverseArray(int numbers[]){
    int first = 0;
    int end = numbers.length-1;

    while(first<end){
        //swap 
        int temp = numbers[end];
        numbers[end] = numbers[first];
numbers[first] = temp;
first++;
end--;
    }
}

public static void main(String[] args) {
    int numbers[] = {2,4,5,6};
    reverseArray(numbers);
    for(int i=0; i<numbers.length; i++){
        System.out.println(numbers[i]);
    }
    System.out.println();



}}

    

