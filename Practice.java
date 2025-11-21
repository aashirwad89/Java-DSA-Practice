public class Practice {

    public static boolean isPalindrome(String s){
        for(int i = 0; i<s.length()/2; i++){
            int n = s.length();
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
      String s = "abba";
      System.out.println(isPalindrome(s));  
    }}
    
