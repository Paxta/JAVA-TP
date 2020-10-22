public class java2_6 {
    public static int fibonachi(int f) {
        int x = 1;
        int y = 1;
        int z;
        for (int i = 2; i <= f; ++i) {
            z = x + y;
            x = y;
            y = z;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(fibonachi(3));
    }
}