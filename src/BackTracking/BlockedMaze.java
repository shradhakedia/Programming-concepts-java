package BackTracking;

public class BlockedMaze {

    public static void main(String[] args) {
        int[][] maze = new int[4][4];
        maze[0][1] = 1;
        maze[2][1] = 1;
        maze[3][2] = 1;
        blockedMaze(maze, 0, 0, "", new boolean[maze.length][maze[0].length]);
    }

     public static void blockedMaze(int[][] maze, int row, int col, String ans, boolean[][] visited) {
         //positive base case
         if(row == maze.length - 1 && col == maze[0].length - 1) {
             System.out.println(ans);
             return;
         }
         //negative base case
         if(row == -1 || row == maze.length || col == -1 || col == maze[0].length) {
             return;
         }

         //blocked path or already visited path, can't move further
         if(maze[row][col] == 1 || visited[row][col]) {
             return;
         }

         //put a mark
         visited[row][col] = true;
         //T
         blockedMaze(maze, row - 1, col, ans + "T", visited);
         //D
         blockedMaze(maze, row + 1, col, ans + "D", visited);
         //L
         blockedMaze(maze, row, col - 1, ans + "L", visited);
         //R
         blockedMaze(maze, row, col + 1, ans + "R", visited);

         //undo
         visited[row][col] = false;
     }
}
