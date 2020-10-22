public class java1_7 {
    public static int func(int x) {
        int N = x;
        while (x != 0) {
            x = x - 1;
            N = N + x;
        }
        return N;
    }

    public static void main(String[] args) {

        System.out.println(func(10));
    }
}