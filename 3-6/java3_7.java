public class java3_7 {
    public static boolean isKapreka(int k) {
        String str = "" + (int) Math.pow(k, 2);
        int kaper = 0;
        if (str.length() > 1) {
            for (int i = 1; i < str.length(); i++) {
                kaper = Integer.parseInt(str.substring(0, i)) + Integer.parseInt(str.substring(i, str.length()));
                if (kaper == k)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isKapreka(45));
    }
}