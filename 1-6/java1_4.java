public class java1_4 {
    public static boolean Func(double prob, int prize, int pay) {
        if (prob * prize > pay)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(Func(0.2, 50, 9));
    }
}