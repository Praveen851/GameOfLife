public class GameOfLife {
    public static void printGrid(short[][] grid, short R, short C){
        for(short row = 0; row < R; row++){
            for(short col = 0; col < C; col++){
                System.out.print(grid[row][col]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        short R = 50, C = 50;
        short[][] grid = new short[R][C];
        printGrid(grid, R, C);
    }
}