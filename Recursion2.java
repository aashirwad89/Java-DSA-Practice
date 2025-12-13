public class Recursion2 {
//     // Tilling problem - given a 2xn board and tiles of size "2x1" count the numbers of ways of the tile given board using 2x1 tiles
    public static int tillingPro(int n){
// base case
if(n==0 || n==1){
    return 1;
}
        // work
        // vertical choice 
        int vertical = tillingPro(n-1);
        // horizontal choice
        int horizontal = tillingPro(n-2);

        int totalWays = vertical + horizontal;

        return totalWays;
    }

// remove the duplicates from string
public static void removeDuplicates(String str, int idx, StringBuilder sb, boolean[] map) {
    if (idx == str.length()) {
        System.out.println(sb.toString());
        return;
    }

    char currChar = str.charAt(idx);
    if (map[currChar - 'a']) {
        // duplicate — skip
        removeDuplicates(str, idx + 1, sb, map);
    } else {
        map[currChar - 'a'] = true;
        removeDuplicates(str, idx + 1, sb.append(currChar), map);
    }
}

// friends pairing problem 
public static int friendPair(int n){
    // base case
    if(n==1 || n==2){
        return n;
    }
    // work 
    // choice - single 
    int fm1 = friendPair(n-1);

    // choice = kisi ke saath
    int fn2 = friendPair(n-2);
    int pairWays = (n-1)*fn2;

    // total
    int totalWay = fm1 + pairWays;
    return totalWay;
}

// Binary Strings problem
public static void printBS(int n , int lastPlace, String str){
    // base case 
    if(n==0){
        System.out.println(str);
        return;
    }
    // kaam
   printBS(n-1, 0, str+"0");
   if(lastPlace == 0){
    printBS(n-1, 1, str+"1");
   }
}

public static void main(String[] args) {
    // String str = "apnnacollege";
    // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
// int n = 3;
// System.err.println(friendPair(n)); 

printBS(3, 0, "");

}}

