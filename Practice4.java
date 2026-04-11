import java.util.*;
public class Practice4 {
   public static void generateBinary(int n){
        Queue<String> q = new LinkedList<>();

        q.add("1");
        for(int i = 1; i<=n; i++){
            String curr = q.remove();
            System.out.println(curr);

            q.add(curr+"0");
            q.add(curr+"1");    
        }
   }

    public static void main(String[] args) {
        int n = 10;
        generateBinary(n);
    }
}
