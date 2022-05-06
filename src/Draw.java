import java.awt.*;

public class Draw {

    //This method draws the snowmen in the grid in the position that the player specifies.
    public static void drawCells(int[][] board, int cellSize) {
        double halfLength = cellSize / 2;
        for (int c = 0; c < board.length; c++) {
            for (int r = 0; r < board[c].length; r++) {
                if (board[c][r] == 1) {
                    StdDraw.setPenColor(Color.green);
                    drawSnowman(r * cellSize + halfLength,(board.length - c) * cellSize - halfLength,halfLength);
                }
                if (board[c][r] == 5) {
                    StdDraw.setPenColor(Color.red);
                    drawSnowman2(r * cellSize + halfLength,(board.length - c) * cellSize - halfLength,halfLength);
                }
            }
        }
    }
    //This method draws the snowmen in the smaller cells of the game inside of game
    public static void drawCells2(int[][][][] board, int cellSize) {
        double halfLength = cellSize / 2;
        for (int c2 = 0; c2 < board.length; c2++) {
            for (int r2 = 0; r2 < board.length; r2++) {
                for (int c = 0; c < board.length; c++) {
                    for (int r = 0; r < board[c].length; r++) {
                        if (board[c2][r2][r][c] == 1) {
                            StdDraw.setPenColor(Color.green);
                            drawSnowmanDouble((c2 * cellSize + halfLength)+(r*1-1 ), ((board.length - r2) * cellSize)-(c*1-1 ) - halfLength, halfLength/3);
                        }
                        if (board[c2][r2][r][c] == 5) {
                            StdDraw.setPenColor(Color.red);
                            drawSnowmanDouble2((c2 * cellSize + halfLength)+(r*1-1 ), ((board.length - r2) * cellSize)-(c*1-1 ) - halfLength, halfLength/3);
                        }
                    }
                }
            }
        }
    }

    //method for snowman with red hat
    public static void drawSnowman(double x, double y, double cellsize){
        StdDraw.setPenColor(Color.white);
        StdDraw.filledCircle(x,y-0.5,0.4);
        StdDraw.filledCircle(x,y+0.16,0.3);
        StdDraw.filledCircle(x,y+0.62,0.2);
        StdDraw.setPenColor(Color.black);
        StdDraw.filledCircle(x-0.075,y+0.66,0.05);
        StdDraw.filledCircle(x+0.075,y+0.66,0.05);
        StdDraw.filledRectangle( x, y+0.52, 0.07, 0.02);
        StdDraw.filledCircle(x, y+0.30, 0.05);
        StdDraw.filledCircle(x, y+0.16, 0.05);
        StdDraw.filledCircle(x, y+0.02, 0.05);
        StdDraw.setPenColor(Color.red);
        StdDraw.filledRectangle(x,y+0.96, 0.12,0.17);
        StdDraw.filledRectangle(x,y+0.84,0.24,0.04);
    }
    //method for snowman with green hat
    public static void drawSnowman2(double x, double y, double cellsize){
        StdDraw.setPenColor(Color.white);
        StdDraw.filledCircle(x,y-0.5,0.4);
        StdDraw.filledCircle(x,y+0.16,0.3);
        StdDraw.filledCircle(x,y+0.62,0.2);
        StdDraw.setPenColor(Color.black);
        StdDraw.filledCircle(x-0.075,y+0.66,0.05);
        StdDraw.filledCircle(x+0.075,y+0.66,0.05);
        StdDraw.filledRectangle( x, y+0.52, 0.07, 0.02);
        StdDraw.filledCircle(x, y+0.30, 0.05);
        StdDraw.filledCircle(x, y+0.16, 0.05);
        StdDraw.filledCircle(x, y+0.02, 0.05);
        StdDraw.setPenColor(Color.green);
        StdDraw.filledRectangle(x,y+0.96, 0.12,0.17);
        StdDraw.filledRectangle(x,y+0.84,0.24,0.04);
    }

    //method to draw green snowman for smaller cells
    public static void drawSnowmanDouble(double x, double y, double cellsize) {
        StdDraw.setPenColor(Color.white);
        StdDraw.filledCircle(x, y - (0.5/3), (0.4/3));
        StdDraw.filledCircle(x, y + (0.16/3), (0.3/3));
        StdDraw.filledCircle(x, y + (0.62/3), (0.2/3));
        StdDraw.setPenColor(Color.black);
        StdDraw.filledCircle(x - (0.075/3), y + (0.66/3), (0.05/3));
        StdDraw.filledCircle(x + (0.075/3), y + (0.66/3), (0.05/3));
        StdDraw.filledRectangle(x, y + (0.52/3), (0.07/3), (0.02/3));
        StdDraw.filledCircle(x, y + (0.30/3), (0.05/3));
        StdDraw.filledCircle(x, y + (0.16/3), (0.05/3));
        StdDraw.filledCircle(x, y + (0.02/3), (0.05/3));
        StdDraw.setPenColor(Color.red);
        StdDraw.filledRectangle(x, y + (0.96/3), (0.12/3), (0.17/3));
        StdDraw.filledRectangle(x, y + (0.84/3), (0.24/3), (0.04/3));
    }

    //method to draw red snowman smaller
    public static void drawSnowmanDouble2(double x, double y, double cellsize) {
        StdDraw.setPenColor(Color.white);
        StdDraw.filledCircle(x, y - (0.5/3), (0.4/3));
        StdDraw.filledCircle(x, y + (0.16/3), (0.3/3));
        StdDraw.filledCircle(x, y + (0.62/3), (0.2/3));
        StdDraw.setPenColor(Color.black);
        StdDraw.filledCircle(x - (0.075/3), y + (0.66/3), (0.05/3));
        StdDraw.filledCircle(x + (0.075/3), y + (0.66/3), (0.05/3));
        StdDraw.filledRectangle(x, y + (0.52/3), (0.07/3), (0.02/3));
        StdDraw.filledCircle(x, y + (0.30/3), (0.05/3));
        StdDraw.filledCircle(x, y + (0.16/3), (0.05/3));
        StdDraw.filledCircle(x, y + (0.02/3), (0.05/3));
        StdDraw.setPenColor(Color.green);
        StdDraw.filledRectangle(x, y + (0.96/3), (0.12/3), (0.17/3));
        StdDraw.filledRectangle(x, y + (0.84/3), (0.24/3), (0.04/3));
    }

    //draws the board recursively depending on argument
    public static void drawBoard (int n, double size, double x, double y){
        if (n == 0) return;
        double x0 = x+size/3;
        double x1 = x+(2*(size/3));
        double x2 = x+size;
        double y0 = y+size/3;
        double y1 = y+(2*(size/3));
        double y2 = y+size;
        StdDraw.line(x0,y,x0,y2);
        StdDraw.line(x1,y,x1,y2);
        StdDraw.line(x,y0,x2,y0);
        StdDraw.line(x,y1,x2,y1);
        StdDraw.setPenColor(Color.green);
        drawBoard(n-1, size/3, x,y+(2*(size/3)));
        drawBoard(n-1, size/3, x+(size/3),y+(2*(size/3)));
        drawBoard(n-1, size/3, x+(2*(size/3)),y+(2*(size/3)));
        drawBoard(n-1, size/3, x,y+(size/3));
        drawBoard(n-1, size/3, x+(size/3),y+(size/3));
        drawBoard(n-1, size/3, x+(2*(size/3)),y+(size/3));
        drawBoard(n-1, size/3, x,y);
        drawBoard(n-1, size/3, x+(size/3),y);
        drawBoard(n-1, size/3, x+(2*(size/3)),y);
    }


    //If a player wins a small cell this method  will fill in the entire cell with the same image
    public static int[][][][] checkDrawingPl1 (int[][][][] board) {
        StdDraw.setPenColor(Color.white);
        for (int c2 = 0; c2 < 3; c2++) {
            for(int r2 = 0;r2<3; r2++) {
                if (board[c2][r2][0][0] == 1 && (board[c2][r2][0][0] == board[c2][r2][0][1] && board[c2][r2][0][0] == board[c2][r2][0][2])) {
                    for(int c=0;c<3;c++){
                        for(int r=0;r<3;r++){
                            board[c2][r2][c][r]=1;
                        }
                    }
                }
                if (board[c2][r2][0][0] == 1 && (board[c2][r2][0][0] == board[c2][r2][1][0] && board[c2][r2][0][0] == board[c2][r2][2][0])) {
                    for(int c=0;c<3;c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 1;
                        }
                    }
                }
                if (board[c2][r2][2][0] == 1 && (board[c2][r2][2][0] == board[c2][r2][2][1] && board[c2][r2][2][0] == board[c2][r2][2][2])) {
                    for(int c=0;c<3;c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 1;
                        }
                    }
                }
                if (board[c2][r2][0][2] == 1 && (board[c2][r2][0][2] == board[c2][r2][1][2] && board[c2][r2][0][2] == board[c2][r2][2][2])) {
                    for(int c=0;c<3;c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 1;
                        }
                    }
                }
                if (board[c2][r2][0][0] == 1 && (board[c2][r2][0][0] == board[c2][r2][1][1] && board[c2][r2][0][0] == board[c2][r2][2][2])) {
                    for (int c = 0; c < 3; c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 1;
                        }
                    }
                }
                if (board[c2][r2][2][0] == 1 && (board[c2][r2][2][0] == board[c2][r2][1][1] && board[c2][r2][2][0] == board[c2][r2][0][2])) {
                    for (int c = 0; c < 3; c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 1;
                        }
                    }
                }
                if (board[c2][r2][1][0] == 1 && (board[c2][r2][1][0] == board[c2][r2][1][1] && board[c2][r2][1][0] == board[c2][r2][1][2])) {
                    for (int c = 0; c < 3; c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 1;
                        }
                    }
                }
                if (board[c2][r2][0][1] == 1 && (board[c2][r2][0][1] == board[c2][r2][1][1] && board[c2][r2][0][1] == board[c2][r2][2][1])) {
                    for (int c = 0; c < 3; c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 1;
                        }
                    }
                }
            }

        }
        return board;
    }

    public static int[][][][] checkDrawingPl2 (int[][][][] board) {
        StdDraw.setPenColor(Color.white);
        for (int c2 = 0; c2 < 3; c2++) {
            for(int r2 = 0;r2<3; r2++) {
                if (board[c2][r2][0][0] == 5 && (board[c2][r2][0][0] == board[c2][r2][0][1] && board[c2][r2][0][0] == board[c2][r2][0][2])) {
                    for(int c=0;c<3;c++){
                        for(int r=0;r<3;r++){
                            board[c2][r2][c][r]=5;
                        }
                    }

                }
                if (board[c2][r2][0][0] == 5 && (board[c2][r2][0][0] == board[c2][r2][1][0] && board[c2][r2][0][0] == board[c2][r2][2][0])) {
                    for(int c=0;c<3;c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 5;
                        }
                    }
                }
                if (board[c2][r2][2][0] == 5 && (board[c2][r2][2][0] == board[c2][r2][2][1] && board[c2][r2][2][0] == board[c2][r2][2][2])) {
                    for(int c=0;c<3;c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 5;
                        }
                    }
                }
                if (board[c2][r2][0][2] == 5 && (board[c2][r2][0][2] == board[c2][r2][1][2] && board[c2][r2][0][2] == board[c2][r2][2][2])) {
                    for(int c=0;c<3;c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 5;
                        }
                    }
                }
                if (board[c2][r2][0][0] == 5 && (board[c2][r2][0][0] == board[c2][r2][1][1] && board[c2][r2][0][0] == board[c2][r2][2][2])) {
                    for (int c = 0; c < 3; c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 5;
                        }
                    }
                }
                if (board[c2][r2][2][0] == 5 && (board[c2][r2][2][0] == board[c2][r2][1][1] && board[c2][r2][2][0] == board[c2][r2][0][2])) {
                    for (int c = 0; c < 3; c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 5;
                        }
                    }
                }
                if (board[c2][r2][1][0] == 5 && (board[c2][r2][1][0] == board[c2][r2][1][1] && board[c2][r2][1][0] == board[c2][r2][1][2])) {
                    for (int c = 0; c < 3; c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 5;
                        }
                    }
                }
                if (board[c2][r2][0][1] == 5 && (board[c2][r2][0][1] == board[c2][r2][1][1] && board[c2][r2][0][1] == board[c2][r2][2][1])) {
                    for (int c = 0; c < 3; c++) {
                        for (int r = 0; r < 3; r++) {
                            board[c2][r2][c][r] = 5;
                        }
                    }
                }
            }

        }
        return board;
    }
}
