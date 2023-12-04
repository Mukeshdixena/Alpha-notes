package T07_Backtraking;

public class B10_rat_in_a_maze {
    public static void main(String[] args) {

    }

    static boolean rat_maze(int x, int y, int maze[][], int path[][]) {
        if (x == maze.length - 1 && y == maze[0].length - 1 && maze[x][y] == 1) {
            path[x][y] = 1;
            return true;
        }

        if (isSafe(x, y, maze)) {
            if (path[x][y] == 1) {
                return false;
            }

            path[x][y] = 1;
            if (rat_maze(x + 1, y, maze, path)) {
                return true;
            }
            if (rat_maze(x, y + 1, maze, path)) {
                return true;
            }

            path[x][y] = 0;
            return false;

        }

        return false;
    }

    static boolean isSafe(int x, int y, int maze[][]) {

        return x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == 1; // 0 not safe, 1 safe
    }
}
