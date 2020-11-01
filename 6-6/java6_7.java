public class java6_7 {
    public static String longestNonrepeatingSubstring(String str) {
        String newstr1 = "";
        String newstr2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (newstr1.indexOf(str.charAt(i)) == -1) {
                newstr1 += str.charAt(i);
            } else {
                if (newstr1.length() > newstr2.length())
                    newstr2 = newstr1;
                newstr1 = "";
                i--;
            }
            if (i == str.length() - 1) {
                if (newstr1.length() > newstr2.length())
                    newstr2 = newstr1;
            }
        }
        return newstr2;
    }

    public static void main(String[] args) {
        System.out.println(longestNonrepeatingSubstring("abcda"));
    }
}