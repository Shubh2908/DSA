// In this problem, we can go in any direction

package BackTracking;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},

        };
        allpath("", board, 0, 0);

    }

    static void allpath(String p, boolean[][] maze, int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){   // maze[r][c] == false → cell is blocked (obstacle)
            return;
        }

        //  I am considering this block in my path
        maze[r][c] = false;

        if (r < maze.length-1){
            allpath(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length-1){
            allpath(p + 'R', maze, r, c+1);
        }

        if (r > 0){
            allpath(p + 'U', maze, r-1, c);
        }

        if (c > 0){
            allpath(p + 'L', maze, r, c-1);
        }

        // This line is where the function will be over
        // so be the function gets removed, also remove the changes that were made by the function

        maze[r][c] = true;
    }
}
