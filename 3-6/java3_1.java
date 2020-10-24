public class java3_1 {
    public static int func(int a, int b, int c) {
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D < 0)
            return 0;
        else if (D == 0)
            return 1;
        else
            return 2;
    }

    public static void main(String[] args) {
        System.out.println(func(1, 0, -1));
    }
}