public class mazePath {
    public static int maze(int sr, int sc, int er, int ec) {
        if(sr > er || sc > ec) return 0;
        if(sr == er && sc == ec) return 1;
        int downStep = maze(sr+1 , sc, er, ec);
        int leftStep = maze(sr , sc+1, er, ec);
        int totalWays = downStep + leftStep;
        return totalWays;
    }
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        int count = maze(1, 1, row, col);
        System.out.println(count);
    }
}
