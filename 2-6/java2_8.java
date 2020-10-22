public class java2_8 {
    public static boolean para(String str1, String str2) {
        if (str1.charAt(0) == str2.charAt(str2.length() - 1) && str1.charAt(str1.length() - 1) == str2.charAt(0))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(para("sparkling", "group"));
    }
}