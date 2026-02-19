// Counting no.of paths in a maze.

package BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
      //  System.out.println(count(3,3));
      //  path("", 3,3);
        System.out.println(pathRet("", 3, 3));
        System.out.println(pathRetDiagonal("", 3, 3));

    }

    // Counting no.of paths in a maze.

    static int count(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1,c); // In left recursion subtree we are decreasing row by 1
        int right = count(r, c-1); // In right recursion subtree we are decreasing column by 1

        return left + right;
    }

    // Printing Paths in a Maze.

    static void path(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if (r > 1){
            path(p + 'D', r-1, c);
        }

        if (c > 1){
            path(p + 'R', r, c-1);
        }

    }
    // Printing Array list of paths

    static ArrayList<String> pathRet(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
           list.addAll(pathRet(p + 'D', r-1, c));
        }

        if (c > 1){
            list.addAll(pathRet(p + 'R', r, c-1));
        }
        return list;
    }

    // Printing Diagonal Paths also

    static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
            list.addAll(pathRetDiagonal(p + 'V', r-1, c));
        }
        if (r > 1 && c > 1){
            list.addAll(pathRetDiagonal(p + 'D', r-1, c-1));
        }

        if (c > 1){
            list.addAll(pathRetDiagonal(p + 'H', r, c-1));
        }
        return list;
    }


}
