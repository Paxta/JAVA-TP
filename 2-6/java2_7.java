public class java2_7 {
    public static boolean Regex(String str) {
        if (str.length() == 5 && str.matches("\\d+"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Regex("000s0"));
    }
}