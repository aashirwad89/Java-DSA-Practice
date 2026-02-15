public class Cont {
  public static void kandanes(int numbers[]){
    int maxSum = Integer.MIN_VALUE;
    int cs = 0;

    for(int i = 0; i<numbers.length; i++){
        cs = cs + numbers[i];
        if(cs<0){
            cs = 0;
        }
        maxSum = Math.max(cs , maxSum);
    }
    System.out.println(maxSum);
  }
   
    public static void main(String[] args){
         int numbers[] = {1,2,3,-2,6};
         kandanes(numbers);
    }
}
