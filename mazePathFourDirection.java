public class mazePathFourDirection {
    public static void maze(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        if(sr < 0 || sc < 0) return;
        if(sr > er || sc > ec) return ;
        if(isVisited[sr][sc] == true) return;
        if(sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // right
        maze(sr, sc+1, er, ec, s+"R", isVisited);
        // left
        maze(sr, sc-1, er, ec, s+"L", isVisited);
        // down
        maze(sr+1, sc, er, ec, s+"D", isVisited);
        // Up
        maze(sr-1, sc, er, ec, s+"L", isVisited);
        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        boolean[][] isVisited = new boolean[row][col];
        maze(0, 0, row-1, col-1, "", isVisited);
    }
}
