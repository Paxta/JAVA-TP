public class java1_10 {
    public static boolean func(int a, int b, int c) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        if (sum % c == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(func(1, 2, 3));
    }
}