public class java6_1 {
    public static int bell(int n) {
        int[][] Bel = new int[n + 1][n + 1];
        Bel[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            Bel[i][0] = Bel[i - 1][i - 1];
            for (int j = 1; j <= i; j++) {
                Bel[i][j] = Bel[i-1][j-1]+Bel[i][j-1];
            }
        }
        return Bel[n][0];
    }

    public static void main(String[] args) {
        System.out.println(bell(3));
    }
}