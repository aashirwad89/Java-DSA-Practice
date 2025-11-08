import java.util.*;
public class Array2 {

// public static boolean search(int matrix[][], int key){
//      for(int i = 0; i<matrix.length; i++){
//             for(int j = 0; j< matrix[0].length ; j++){
//               if(matrix[i][j] ==key){
//                 System.out.println("element found at cell" + " " + i + " " + j);
//                 return true;
//               }
//             }
            
//         }
//         System.err.println("key not found ");
//         return false;
// }

// spiral matrix - PYQ Of companies
// public static void printSpiral(int matrix[][]){
//      int startRow = 0;
//      int startCol = 0;
//      int endRow = matrix.length-1;
//      int endCol = matrix.length-1;
//      while(startRow<=endRow && startCol<=endCol){
//         // top
//         for(int j=startCol; j<=endCol; j++){
// System.out.print(matrix[startRow][j]+ " ");
// }
// // right
// for(int i=startRow+1; i<=endRow; i++){
//     System.out.print(matrix[i][endCol]+ " ");
// }
// // bottom
// for(int j=endCol-1; j>=startCol; j--){
//     if(startRow == endRow){
//         break;
//     }
//     System.out.print(matrix[endRow][j]+ " ");
// }
// // left
// for(int i=endRow-1; i>=startRow+1; i--){
//      if(startCol == endCol){
//         break;
//     }
//     System.out.print(matrix[i][startCol]+ " ");
// }
// startRow++;
// startCol++;
// endRow--;
// endCol--;  
//      }
//      System.out.println();
// }


// diagonal matrix = PYQ
// public static int diagonalSum(int matrix[][]){
//     int sum = 0;
    // for(int i = 0; i<matrix.length; i++){
    //     for(int j=0; j<matrix[0].length; j++){
    //         // 
    //         if(i == j){
    //             sum += matrix[i][j];
    //         }
    //        else if(i+j == matrix.length-1){
    //          sum += matrix[i][j];
    //         }
    //     }
// }
// time compelexity of above code is O(n) - not so much efficient

// another better approach to do the diagonal Sum question 
// for(int i =0; i<matrix.length; i++){
//     // primary diagonal 
//     sum += matrix[i][i];

//     // secondary diagonal 
//     if(i != matrix.length-1-i){
//     sum += matrix[i] [matrix.length-i-1];
//     }
// }

//     return sum;
// }
 

public static boolean stairCaseSearch(int matrix[][], int key){
int row = 0;
int col = matrix[0].length-1;

while(row<matrix.length && col >= 0){
    if(matrix[row][col] == key){
        System.out.println("Found key at" + row + " " + col + " ");
        return true;
    }

    else if(key < matrix[row][col]){
        col--;
    }else {
        row++;
    }
}
System.out.println("key not found");
return false;
};
    public static void main(String[] args) {
// int matrix [][] = {{1,2,3,4},{5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
int matrix [][] = {{10, 20,30,40,50},
{15,25, 35, 45},
{27, 29 , 37, 48},
{32, 33, 39, 50}
};
int key = 33;

        // int matrix[][] = new int[3][3];
        // int n = matrix.length;
        // int m = matrix[0].length;

        // Scanner sc = new Scanner(System.in);
        // for(int i =0; i<n; i++){
        //     for(int j =0; j<m ; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // // output
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j< m ; j++){
        //        System.out.print(matrix[i][j] + " ") ;
        //     }
        //     System.out.println(); 
        // }
        // search(matrix, 5);
        // printSpiral(matrix);
        // diagonalSum(matrix);
        // System.out.println(diagonalSum(matrix));

        stairCaseSearch(matrix, key);
    }
}
