// import java.sql.Struct;
// import java.util.*;
// public class Strings {
//     // public static void printLetters(String str){
//     //     for(int i=0; i<str.length(); i++){
//     //         System.out.println(str.charAt(i) + "");
//     //     }
//     //     System.out.println();
//     // }

// //     public static boolean palinPrint(String str){
// // for(int i = 0; i<str.length()/2; i++){
// //     int n = str.length();
// //     if(str.charAt(i) != str.charAt(n-i-1)){
// //         // not a palindrome
// //         return false;
// //     }
// // }

// // public static float shortPath(String str){
// //     int x =0, y=0;

// //     for(int i =0; i<str.length(); i++){
// //         char dir = str.charAt(i);
// //         // south
// //         if(dir == 'S'){
// //             y--;
// //         }else if(dir == 'N'){ //north
// // y++;
// //         }else if(dir == 'W'){//west
// //             x--;
// //         }else{ //east
// //             x++;
// //         }
// //     }
// //     int X2 = x*x;
// //     int Y2 = y*y;
// //     return  (float)Math.sqrt(X2 + Y2);
// // };


// // public static String printSub(String str, int si , int ei){
// // String substr = "";
// // for(int i=si; i<ei; i++){
// //     substr += str.charAt(i);
// // }
// // return substr;
// // }

// // public static String toUpperCase(String str){
// //     StringBuilder sb = new StringBuilder("");

// //     char ch = Character.toUpperCase(str.charAt(0));
// //     sb.append(ch);

// //     for(int i=1; i<str.length(); i++){
// //         if(str.charAt(i) == ' ' && i<str.length()-1) {
// //             sb.append(str.charAt(i));
// //             i++;
// // sb.append(Character.toUpperCase(str.charAt(i))); 
// //         }else{
// //             sb.append(str.charAt(i));
// //         }
// //     }
// //     return sb.toString();
// // }

// // public static String compress(String str){
// //     String newStr  = " ";
// //     for(int i=0; i<str.length(); i++){
// //         Integer count =1;
// //         while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
// //             count++;
// //             i++;

// //         }
// //         newStr += str.charAt(i);
// //         if(count > 1){
// //             newStr += count.toString();
        
// //         }
// //     }
// //     return newStr;


// // }



//     public static void main(String[] args) {
//         // char arr[] = {'a', 'b', 'c', 'd'};
//         // String str = "abcd";
//         // String str2 = new String("xyz");

//     //     // strings are immutable 
//     //     Scanner sc = new Scanner(System.in);
//     //     String name;
//     //    name = sc.next();
//     //    System.out.println(name);

//     // String fullName = "Tony Stark";
//     // System.out.println(fullName.length());

//     // String firstName ="Aashirwad";
//     // String lastName = "Singh";
//     // System.out.println(firstName.concat(lastName));
//     // System.out.println(firstName.charAt(1));

//     // String str = "racecar";
//     // System.out.println(palinPrint(str));

//     // String str = "WNEENESENNN";
//     // System.out.println(shortPath(str));

//     // String str = "HelloWorld";
    
//     // System.out.println(str.substring(0,5));
//     // System.out.println(printSub(str, 0, 5));


// //     String fruits[] = {"apple", "mango", "banana"};
// // String largest = fruits[0];
// // for(int i=1; i<fruits.length;i++){
// //      if(largest.compareToIgnoreCase(fruits[i]) < 0){
// // largest = fruits[i];
// //      }
// // }

// // System.out.println(largest);

// // StringBuilder sb = new StringBuilder("");
// // for(char ch ='a'; ch<='z'; ch++){
// //     sb.append(ch);
// // }
// // System.out.println(sb);

// // String str = "hi , i am shraddha";
// // System.out.println(toUpperCase(str));

// // String str = "aaabbcccdd";
// // System.out.println(compress(str));

// // String str = new Scanner(System.in).next();
// // int count = 0;

// // for(int i=0; i<str.length(); i++){
// //     char ch = str.charAt(i);
// //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
// //         count++;
// //     }
       
// //     }
// //      System.out.println(count);

// String str1 = "care";
// String str2 = "race";

// if(str1.length() == str2.length()){
//    char[] str1charArray = str1.toCharArray();
//    char[] str2charArray = str2.toCharArray();


//    Arrays.sort(str1charArray);
//    Arrays.sort(str2charArray);


//    boolean result = Arrays.equals(str1charArray, str2charArray);
//    if(result){
//     System.out.println("Strings are anagrams");
//    }else{
//     System.out.println("Strings are not anagrams");
//    }
// }else{
//     System.out.println("Strings are not anagrams doosra wala");
// }

// }




//     }



