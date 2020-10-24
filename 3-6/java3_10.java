public class java3_10 {
    public static boolean rightTriangl(int a, int b, int c) {
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2) || Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)
                || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(rightTriangl(145, 105, 100));
    }
}