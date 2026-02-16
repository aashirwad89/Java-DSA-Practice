public class BackTracking {
public static void changeArr(int arr[], int i , int val){
    // base case 
if(i == arr.length){
    printArr(arr);
    return;
}

    // recursion
arr[i] = val;
changeArr(arr, i+1, val+1);
arr[i] = arr[i] - 2;
}

public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
}

public static void findSubset(String str, String ans , int Idx){
    // base case
    if(Idx == str.length()){
        if(ans.length() == 0){
            System.out.println("null");
        }else {
System.out.println(ans);
        }
        
        return; 
    }
    
    // recurison 
    // yes choice 
    findSubset(str, ans+str.charAt(Idx), Idx+1);
    // No choice 
    findSubset(str, ans, Idx+1);


}

public static void findPermutation(String str, String ans){
// base case


// recursion

for(int i=0; i<str.length(); i++){
    char curr  = str.charAt(i);
    str = str.substring(0,i) + str.substring(i+1);
    findPermutation(str, ans+curr);
}
}

// public static int nQueens(char board[][], int row){
// // base case 
// if(row == board.length){
//    printBoard(board);
//     return 1; 
// }
//     // col
//     for(int j =0; j<board.length; j++){
//         board[row][j] = 'Q';
//         nQueens(board, row+1);
//         board[row][j] = '.';
//     }
// }
 public static void printBoard(char board[][]){
    for(int i = 0; i<board.length; i++){
        for(int j = 0 ; j<board.length; j++){
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
 }

 public static int gridWays(int i , int j, int n , int m){
// base case 
if(i == n-1 && j == m-1){
    return 1;
}else if(i == n || j == n){
return 0;
}



int way1 = gridWays(i+1, j, n, m);
int way2 = gridWays(i, j+1, n, m);
return way1 + way2;
 }

 public static boolean isSafe(int sudoku[][] , int row , int col, int digits){
    // column 
    for(int i=0; i<=8; i++){
        if(sudoku[i][col] == digits){
            return false;
        }
    }

    // row
    for(int j =0; j<=8; j++){
        if(sudoku[row][j] == digits){
            return false;
        }
    }

    // grid
    int sr = (row/3)*3;
    int sc = (col/3) *3;

    for(int i = sr; i<sr+3; i++){
        for(int j =sc ; j<sc+3; j++){
            if(sudoku[i][j] == digits){
                return false;
            }
        }
    }
    return true;
 }

 public static boolean sudokuSolver(int sudoku[][], int row , int col){
    // base case
if(row == 9 && col == 0){
    return true;
}

    int nextRow = row;
    int nextCol = col+1;
    if(col+1 == 9){
        nextRow = row+1;
        nextCol = 0;
    }

    if(sudoku[row][col] != 0){
      return  sudokuSolver(sudoku, nextRow, nextCol);
    }
    // recusion
    for(int digits=1; digits<=9; digits++){
        if(isSafe(sudoku, row , col, digits)){
            sudoku[row][col] = digits;
            if(sudokuSolver(sudoku, nextRow, nextCol)){
                return true;
            }
            sudoku [row][col] = 0;
        }
    }

    return false;
 }
public static void printSudoku(int sudoku[][]){
    for(int i = 0; i<9; i++){
        for(int j=0; j<9; j++){
            System.out.print(sudoku[i][j] + " ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        // subsets of an string 
        // String str  = "abc";
        // findSubset(str, "", 0);

//         String str = "abc";
// findPermutation(str, "");

// int n = 2;
// char board[][] = new char[n][n];

// intialize
// for(int i=0; i<n; i++){
//     for(int j =0; j<n; j++){
//         board[i][j] = '.';
//     }
// }
// nQueens(board, 0);

// int n = 3;
// int m = 3;
// System.out.println(gridWays(0, 0, n, m));

// sudoku solver
int sudoku[][] = {
    {0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2},
    {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,0,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7},
    {8,2,7,0,0,9,0,1,3}
};

if(sudokuSolver(sudoku, 0, 0)){
    System.out.println("Solution exist");
printSudoku(sudoku);
}else{
    System.out.println("Solution not exist ");
}

    }
}
