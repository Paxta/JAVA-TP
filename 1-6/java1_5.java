public class java1_5 {
    public static String Ploshad(int N, int a, int b) {
        if (a + b == N)
            return "added";
        else if (a - b == N)
            return "subtracted";
        else if (a * b == N)
            return "multiplied";
        else if (a / b == N)
            return "divided";
        else
            return "none";
    }

    public static void main(String[] args) {

        System.out.println(Ploshad(15, 11, 11));
    }
}