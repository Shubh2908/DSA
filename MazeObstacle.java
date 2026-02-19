package BackTracking;

public class MazeObstacle {
    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true},

        };

        pathRestriction("", board, 0, 0);
    }

    static void pathRestriction(String p, boolean[][] maze,int r, int c){

        // maze.length → number of rows in the maze
        //maze[0].length → number of columns in the maze
        // -1 bcoz index starts from zero
        // This condition checks if you have reached the bottom-right corner of the maze.

        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        // This checks if the current cell in the maze is blocked.
        if (!maze[r][c]){   // maze[r][c] == false → cell is blocked (obstacle)
            return;
        }

        if (r < maze.length-1){
            pathRestriction(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length-1){
            pathRestriction(p + 'R', maze, r, c+1);
        }
    }
}
