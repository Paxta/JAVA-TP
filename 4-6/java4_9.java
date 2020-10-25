public class java4_9 {
    public static boolean trouble(long a, long b) {
        String str1 = "" + a;
        String str2 = "" + b;
        int kol = 0, kol2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (i != str1.length() - 1) {
                if (str1.charAt(i) == str1.charAt(i + 1))
                    kol++;
                else
                    kol = 0;
                if (kol == 2) {
                    for (int j = 0; j < str2.length(); j++) {
                        if (str1.charAt(i) == str2.charAt(j)) {
                            kol2++;
                        } else {
                            kol2 = 0;
                        }
                        if (kol2 == 2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(trouble(666789, 1234566));
    }
}