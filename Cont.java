public class Cont {
    
    public static long fastPower(long x, long n) {
       if(n==0) return 1;

       long half = fastPower(x, n/2);

       if(n%2 == 0){
        return half* half;
       }else{
        return x*half*half;
       }
    }
    
    public static void main(String[] args) {
      System.out.println(fastPower(2,10)); //1024
    }
}