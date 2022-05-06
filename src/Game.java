import java.awt.*;

public class Game {
//Initializes the normal tic tac toe grid
    public static int[][] initialize(int numCells) {
        int [][] grid = new int[numCells][numCells];
        for (int c = 0; c < numCells; c++) {
            for(int r = 0; r < numCells; r++)
                grid[c][r] = 0;
        }
        return grid;}

//Initializes the grids inside of grid
    public static int[][][][] initialize2(int numCells) {
        int [][][][] grid = new int[numCells][numCells][numCells][numCells];
        for(int c2 =0; c2<numCells;c2++){
        for(int r2 =0; r2<numCells;r2++){
        for (int c = 0; c < numCells; c++) {
            for(int r = 0; r < numCells; r++)
                grid[c2][r2][c][r] = 0;
        }}}
        return grid;}

//Checks the score of player 1 in normal TTT game
     public static boolean checkScorePl1 (int[][] board){
        StdDraw.setPenColor(Color.white);
        if(board[0][0]==1&&(board[0][0]==board[0][1]&&board[0][0]==board[0][2])){
            StdDraw.text(4,-1,"Player 1 wins!");
            return true;
        }
         if(board[0][0]==1&&(board[0][0]==board[1][0]&&board[0][0]==board[2][0])){
             StdDraw.text(4,-1,"Player 1 wins!");
             return true;
         }
         if(board[2][0]==1&&(board[2][0]==board[2][1]&&board[0][0]==board[2][2])){
             StdDraw.text(4,-1,"Player 1 wins!");
             return true;
         }
         if(board[0][2]==1&&(board[0][2]==board[1][2]&&board[0][2]==board[2][2])){
             StdDraw.text(4,-1,"Player 1 wins!");
             return true;
         }
         if(board[0][0]==1&&(board[0][0]==board[1][1]&&board[0][0]==board[2][2])){
             StdDraw.text(4,-1,"Player 1 wins!");
             return true;
         }
         if(board[2][0]==1&&(board[2][0]==board[1][1]&&board[2][0]==board[0][2])){
             StdDraw.text(4,-1,"Player 1 wins!");
             return true;
         }
         if(board[1][0]==1&&(board[1][0]==board[1][1]&&board[1][0]==board[1][2])){
             StdDraw.text(4,-1,"Player 1 wins!");
             return true;
         }
         if(board[0][1]==1&&(board[0][1]==board[1][1]&&board[0][1]==board[2][1])){
             StdDraw.text(4,-1,"Player 1 wins!");
             return true;
         }
         return false;
    }

//Checks the score of player two in normal TTT game
    public static boolean checkScorePl2 (int[][] board){
        StdDraw.setPenColor(Color.white);
        if(board[0][0]==5&&(board[0][0]==board[0][1]&&board[0][0]==board[0][2])){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(board[0][0]==5&&(board[0][0]==board[1][0]&&board[0][0]==board[2][0])){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(board[2][0]==5&&(board[2][0]==board[2][1]&&board[2][0]==board[2][2])){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(board[0][2]==5&&(board[0][2]==board[1][2]&&board[0][2]==board[2][2])){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(board[0][0]==5&&(board[0][0]==board[1][1]&&board[0][0]==board[2][2])){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(board[2][0]==5&&(board[2][0]==board[1][1]&&board[2][0]==board[0][2])){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(board[1][0]==5&&(board[1][0]==board[1][1]&&board[1][0]==board[1][2])){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(board[0][1]==5&&(board[0][1]==board[1][1]&&board[0][1]==board[2][1])){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        return false;
    }
    // Checks if there is a tie in normal TTT game
    public static boolean checkTie (int [][] board){
        for(int c=0;c<board.length;c++){
            for(int r=0;r<board.length;r++){
                if(board[c][r]==0) return true;
            }
        }
     return false;}

     //Checks board to see if Player 1 won any of the smaller cells of the board
    public static boolean checkScore2Pl1 (int[][][][] board) {
        StdDraw.setPenColor(Color.white);
        for (int c2 = 0; c2 < 3; c2++) {
            for(int r2 = 0;r2<3; r2++) {
                if (board[c2][r2][0][0] == 1 && (board[c2][r2][0][0] == board[c2][r2][0][1] && board[c2][r2][0][0] == board[c2][r2][0][2])) {
                    return true;
                }
                if (board[c2][r2][0][0] == 1 && (board[c2][r2][0][0] == board[c2][r2][1][0] && board[c2][r2][0][0] == board[c2][r2][2][0])) {
                    return true;
                }
                if (board[c2][r2][2][0] == 1 && (board[c2][r2][2][0] == board[c2][r2][2][1] && board[c2][r2][2][0] == board[c2][r2][2][2])) {
                    return true;
                }
                if (board[c2][r2][0][2] == 1 && (board[c2][r2][0][2] == board[c2][r2][1][2] && board[c2][r2][0][2] == board[c2][r2][2][2])) {
                    return true;
                }
                if (board[c2][r2][0][0] == 1 && (board[c2][r2][0][0] == board[c2][r2][1][1] && board[c2][r2][0][0] == board[c2][r2][2][2])) {
                    return true;
                }
                if (board[c2][r2][2][0] == 1 && (board[c2][r2][2][0] == board[c2][r2][1][1] && board[c2][r2][2][0] == board[c2][r2][0][2])) {
                    return true;
                }
                if (board[c2][r2][1][0] == 1 && (board[c2][r2][1][0] == board[c2][r2][1][1] && board[c2][r2][1][0] == board[c2][r2][1][2])) {
                    return true;
                }
                if (board[c2][r2][0][1] == 1 && (board[c2][r2][0][1] == board[c2][r2][1][1] && board[c2][r2][0][1] == board[c2][r2][2][1])) {
                    return true;
                }
            }

        }
        return false;
    }
    //Checks board to see if Player 2 won any of the smaller cells of the board
    public static boolean checkScore2Pl2 (int[][][][] board) {
        StdDraw.setPenColor(Color.white);
        for (int c2 = 0; c2 < 3; c2++) {
            for(int r2 = 0;r2<3; r2++) {
                if (board[c2][r2][0][0] == 5 && (board[c2][r2][0][0] == board[c2][r2][0][1] && board[c2][r2][0][0] == board[c2][r2][0][2])) {
                    return true;
                }
                if (board[c2][r2][0][0] == 5 && (board[c2][r2][0][0] == board[c2][r2][1][0] && board[c2][r2][0][0] == board[c2][r2][2][0])) {
                    return true;
                }
                if (board[c2][r2][2][0] == 5 && (board[c2][r2][2][0] == board[c2][r2][2][1] && board[c2][r2][2][0] == board[c2][r2][2][2])) {
                    return true;
                }
                if (board[c2][r2][0][2] == 5 && (board[c2][r2][0][2] == board[c2][r2][1][2] && board[c2][r2][0][2] == board[c2][r2][2][2])) {
                    return true;
                }
                if (board[c2][r2][0][0] == 5 && (board[c2][r2][0][0] == board[c2][r2][1][1] && board[c2][r2][0][0] == board[c2][r2][2][2])) {
                    return true;
                }
                if (board[c2][r2][2][0] == 5 && (board[c2][r2][2][0] == board[c2][r2][1][1] && board[c2][r2][2][0] == board[c2][r2][0][2])) {
                    return true;
                }
                if (board[c2][r2][1][0] == 5 && (board[c2][r2][1][0] == board[c2][r2][1][1] && board[c2][r2][1][0] == board[c2][r2][1][2])) {
                    return true;
                }
                if (board[c2][r2][0][1] == 5 && (board[c2][r2][0][1] == board[c2][r2][1][1] && board[c2][r2][0][1] == board[c2][r2][2][1])) {
                    return true;
                }
            }

        }
        return false;
    }


    //Sum of the values of a certain main cell on the board
    public static int cellSum (int[][][][] board, int c2,int r2){
        int sum=0;
        for(int c=0;c<3;c++ ){
            for(int r=0; r<3;r++){
                sum=sum+board[c2][r2][c][r];
            }
        }
    return sum;
    }

    //Checks the main board to see if any players have won the entire game
    public static boolean checkMainScorePl1 (int [][][][] board){
        StdDraw.setPenColor(Color.white);
        if(cellSum(board,0,0)==9&&(cellSum(board,0,0)==cellSum(board,0,1)&&cellSum(board,0,0)==cellSum(board,0,2))){
            StdDraw.text(4,-1,"Player 1 wins!");
            return true;
        }
        if(cellSum(board,0,0)==9&&(cellSum(board,0,0)==cellSum(board,1,0)&&cellSum(board,0,0)==cellSum(board,2,0))){
            StdDraw.text(4,-1,"Player 1 wins!");
            return true;
        }
        if(cellSum(board,2,0)==9&&(cellSum(board,2,0)==cellSum(board,2,1)&&cellSum(board,2,0)==cellSum(board,2,2))){
            StdDraw.text(4,-1,"Player 1 wins!");
            return true;
        }
        if(cellSum(board,0,2)==9&&(cellSum(board,0,2)==cellSum(board,1,2)&&cellSum(board,0,2)==cellSum(board,2,2))){
            StdDraw.text(4,-1,"Player 1 wins!");
            return true;
        }
        if(cellSum(board,0,0)==9&&(cellSum(board,0,0)==cellSum(board,1,1)&&cellSum(board,0,0)==cellSum(board,2,2))){
            StdDraw.text(4,-1,"Player 1 wins!");
            return true;
        }
        if(cellSum(board,2,0)==9&&(cellSum(board,2,0)==cellSum(board,1,1)&&cellSum(board,2,0)==cellSum(board,2,2))){
            StdDraw.text(4,-1,"Player 1 wins!");
            return true;
        }
        if(cellSum(board,1,0)==9&&(cellSum(board,1,0)==cellSum(board,1,1)&&cellSum(board,1,0)==cellSum(board,1,2))){
            StdDraw.text(4,-1,"Player 1 wins!");
            return true;
        }
        if(cellSum(board,0,1)==9&&(cellSum(board,0,1)==cellSum(board,1,1)&&cellSum(board,0,1)==cellSum(board,2,1))){
            StdDraw.text(4,-1,"Player 1 wins!");
            return true;
        }
        return false;
    }

    public static boolean checkMainScorePl2 (int [][][][] board){
        StdDraw.setPenColor(Color.white);
        if(cellSum(board,0,0)==45&&(cellSum(board,0,0)==cellSum(board,0,1)&&cellSum(board,0,0)==cellSum(board,0,2))){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(cellSum(board,0,0)==45&&(cellSum(board,0,0)==cellSum(board,1,0)&&cellSum(board,0,0)==cellSum(board,2,0))){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(cellSum(board,2,0)==45&&(cellSum(board,2,0)==cellSum(board,2,1)&&cellSum(board,2,0)==cellSum(board,2,2))){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(cellSum(board,0,2)==45&&(cellSum(board,0,2)==cellSum(board,1,2)&&cellSum(board,0,2)==cellSum(board,2,2))){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(cellSum(board,0,0)==45&&(cellSum(board,0,0)==cellSum(board,1,1)&&cellSum(board,0,0)==cellSum(board,2,2))){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(cellSum(board,2,0)==45&&(cellSum(board,2,0)==cellSum(board,1,1)&&cellSum(board,2,0)==cellSum(board,2,2))){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(cellSum(board,1,0)==45&&(cellSum(board,1,0)==cellSum(board,1,1)&&cellSum(board,1,0)==cellSum(board,1,2))){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        if(cellSum(board,0,1)==45&&(cellSum(board,0,1)==cellSum(board,1,1)&&cellSum(board,0,1)==cellSum(board,2,1))){
            StdDraw.text(4,-1,"Player 2 wins!");
            return true;
        }
        return false;
    }

    //Checks to see if there is a tie in in the main board
    public static boolean checkTie2 (int [][][][] board){
        for (int c2 = 0; c2 < 3; c2++) {
            for(int r2 = 0;r2<3; r2++) {
                for (int c = 0; c < board.length; c++) {
                    for (int r = 0; r < board.length; r++) {
                        if (board[c2][r2][c][r] == 0) return true;
                    }
                }
            }
        }
        return false;}


    }





