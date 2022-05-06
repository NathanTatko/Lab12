import java.awt.*;
import java.util.Scanner;
public class Project {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        StdDraw.setXscale(-1, 9);
        StdDraw.setYscale(-2, 10);
        StdDraw.setPenColor(Color.black);
        StdDraw.filledSquare(5, 5, 30);
        int gameSize = Integer.parseInt(args[0]);
        if (gameSize < 1 || gameSize > 2) {
            System.err.print("Must input 1 for regular board or 2 for a board made of boards.");
            System.exit(1);
        }
        StdDraw.setPenColor(Color.red);
        Draw.drawBoard(gameSize, 9, -0.5, 0.5);

        // Normal Tic-Tac-Toe game
        if (gameSize == 1) {
            int[][] board = Game.initialize(3);
            while (true) {
                while (true) {
                    int c;
                    int r;
                    System.out.print("Player 1 ");
                    System.out.print("What column? ");
                    c = keyboard.nextInt();
                    System.out.print("Player 1 ");
                    System.out.print("What row? ");
                    r = keyboard.nextInt();
                    if ((r < 3 && r > -1) && (c < 3 && c > -1) && (board[r][c] == 0)) {
                        board[r][c] = 1;
                        Draw.drawCells(board, 3);
                        Game.checkScorePl1(board);
                        break;
                    } else {
                        System.out.println("Invalid input! Try another square.");
                        continue;
                    }
                }
                if (Game.checkTie(board) == false && Game.checkScorePl1(board) == false) {
                    System.out.println("It's a tie. Game Over.");
                    StdDraw.text(4, -1, "It's a tie!");
                    break;
                }
                if (Game.checkScorePl1(board) == true) {
                    System.out.println("Game Over");
                    break;
                }
                while (true) {
                    int c;
                    int r;
                    System.out.print("Player 2 ");
                    System.out.print("What column? ");
                    c = keyboard.nextInt();
                    System.out.print("Player 2 ");
                    System.out.print("What row? ");
                    r = keyboard.nextInt();
                    if ((r < 3 && r > -1) && (c < 3 && c > -1) && (board[r][c] == 0)) {
                        board[r][c] = 5;
                        Draw.drawCells(board, 3);
                        break;
                    } else {
                        System.out.println("Invalid input! Try another square.");
                        continue;
                    }
                }
                if (Game.checkTie(board) == false && Game.checkScorePl2(board) == false) {
                    System.out.println("It's a tie. Game Over.");
                    StdDraw.text(4, -1, "It's a tie!");
                    break;
                }
                if (Game.checkScorePl2(board) == true) {
                    System.out.println("Game Over");
                    break;
                }
            }
        }
        // Game with board inside of board
        if (gameSize == 2) {
            int[][][][] board = Game.initialize2(3);
            while (true) {
                while (true) {
                    int c2;
                    int r2;
                    int c;
                    int r;
                    System.out.print("Player 1 ");
                    System.out.print("What main column? ");
                    c2 = keyboard.nextInt();
                    System.out.print("Player 1 ");
                    System.out.print("What main row? ");
                    r2 = keyboard.nextInt();
                    System.out.print("Player 1 ");
                    System.out.print("What inner column? ");
                    c = keyboard.nextInt();
                    System.out.print("Player 1 ");
                    System.out.print("What inner row? ");
                    r = keyboard.nextInt();
                    if ((r < 3 && r > -1) && (c < 3 && c > -1) && (r2 < 3 && r2 > -1) && (c2 < 3 && c2 > -1) && (board[c2][r2][c][r] == 0)) {
                        board[c2][r2][c][r] = 1;
                        StdDraw.clear();
                        StdDraw.setPenColor(Color.black);
                        StdDraw.filledSquare(5, 5, 30);
                        StdDraw.setPenColor(Color.red);
                        Draw.drawBoard(gameSize, 9, -0.5, 0.5);
                       if(Game.checkScore2Pl1(board)==true);{
                        Draw.checkDrawingPl1(board);}
                        Draw.drawCells2(board, 3);
                        break;
                    } else {
                        System.out.println("Invalid input! Try another square.");
                        continue;
                    }
                }
                if (Game.checkTie2(board) == false && Game.checkMainScorePl1(board)== false) {
                    System.out.println("It's a tie. Game over.");
                    StdDraw.text(4, -1, "It's a tie!");
                    break;
                }
                if (Game.checkMainScorePl1(board) == true) {
                    System.out.println("Game Over");
                    break;
                }
                while (true) {
                    int c2;
                    int r2;
                    int c;
                    int r;
                    System.out.print("Player 2 ");
                    System.out.print("What main column? ");
                    c2 = keyboard.nextInt();
                    System.out.print("Player 2 ");
                    System.out.print("What main row? ");
                    r2 = keyboard.nextInt();
                    System.out.print("Player 2 ");
                    System.out.print("What inner column? ");
                    c = keyboard.nextInt();
                    System.out.print("Player 2 ");
                    System.out.print("What inner row? ");
                    r = keyboard.nextInt();
                    if ((r < 3 && r > -1) && (c < 3 && c > -1) && (r2 < 3 && r2 > -1) && (c2 < 3 && c2 > -1) && (board[c2][r2][c][r] == 0)) {
                        board[c2][r2][c][r] = 5;
                        StdDraw.clear();
                        StdDraw.setPenColor(Color.black);
                        StdDraw.filledSquare(5, 5, 30);
                        StdDraw.setPenColor(Color.red);
                        Draw.drawBoard(gameSize, 9, -0.5, 0.5);
                        if(Game.checkScore2Pl2(board)==true){
                        Draw.checkDrawingPl2(board);}
                        Draw.drawCells2(board, 3);
                        break;
                    } else {
                        System.out.println("Invalid input! Try another square.");
                        continue;
                    }
                }
                if (Game.checkTie2(board) == false && Game.checkMainScorePl2(board)== false) {
                    System.out.println("It's a tie. Game over.");
                    StdDraw.text(4, -1, "It's a tie!");
                    break;
                }
                if (Game.checkMainScorePl2(board) == true) {
                    System.out.println("Game Over");
                    break;
                }
                }
            }
        }
    }


