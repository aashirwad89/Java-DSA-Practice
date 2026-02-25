public class Practice4 {
   

    public static void main(String[] args) {
        int n = 4;
        for(int line = 1; line <= n; line++){
            for(int stars = 1; stars <= n-line+1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
