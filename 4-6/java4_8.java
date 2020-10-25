public class java4_8 {
    public static boolean doesRhyme(String str1, String str2) {
        String s1 = "", s2 = "";
        char v = ' ';
        str1 = str1.substring(str1.lastIndexOf(" ") + 1);
        for (int i = 0; i < str1.length(); i++) {
            v = Character.toLowerCase(str1.charAt(i));
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'y') {
                s1 += v;
            }
        }
        str2 = str2.substring(str2.lastIndexOf(" ") + 1);
        for (int i = 0; i < str2.length(); i++) {
            v = Character.toLowerCase(str2.charAt(i));
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'y') {
                s2 += v;
            }
        }
        return  s1.equals(s2);
    }
    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and HAM."));
    }
}