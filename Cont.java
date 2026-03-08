public class Cont {
  public static int gridWays(int i , int j , int n , int m){
    // destination reached
     if(i == n-1 && j == m-1){
      return 1;
     }

if(i>=n || j>= m){
  return 0;
}

  // move right 
  int rightWays = gridWays(i, j+1, n, m);

    // move down 
int leftWays = gridWays(i+1, j, n, m);

    // return the output 
    return rightWays + leftWays;
  }
    
     
    
    public static void main(String[] args) {
       int n = 3;
        int m = 3;

        int ways = gridWays(0, 0, n, m);
        System.out.println("Total Ways = " + ways);
    }
}