import java.util.*;
public class Strings {
    // public static void printLetters(String str){
    //     for(int i=0; i<str.length(); i++){
    //         System.out.println(str.charAt(i) + "");
    //     }
    //     System.out.println();
    // }

//     public static boolean palinPrint(String str){
// for(int i = 0; i<str.length()/2; i++){
//     int n = str.length();
//     if(str.charAt(i) != str.charAt(n-i-1)){
//         // not a palindrome
//         return false;
//     }
// }

public static float shortPath(String str){
    int x =0, y=0;

    for(int i =0; i<str.length(); i++){
        char dir = str.charAt(i);
        // south
        if(dir == "S"){
            y--;
        }else if(dir == "N"){ //north
y++;
        }else if(dir == "W"){//west
            x--;
        }else{ //east
            x++;
        }
    }
    int X2 = x*x;
    int Y2 = y*y;
    return  (float)Math.sqrt(X2 + Y2);
};
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

    //     // strings are immutable 
    //     Scanner sc = new Scanner(System.in);
    //     String name;
    //    name = sc.next();
    //    System.out.println(name);

    // String fullName = "Tony Stark";
    // System.out.println(fullName.length());

    // String firstName ="Aashirwad";
    // String lastName = "Singh";
    // System.out.println(firstName.concat(lastName));
    // System.out.println(firstName.charAt(1));

    // String str = "racecar";
    // System.out.println(palinPrint(str));

    String str = "WNEENESENNN";
    System.out.println(shortPath(str));

    }
}
 