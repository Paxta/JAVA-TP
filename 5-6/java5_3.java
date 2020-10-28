public class java5_3 {
    public static boolean canComplete(String str1, String str2) {
        String fin = str2;
        String fin2 = "" + str1.charAt(0);
        ;
        char[] ch = str1.toCharArray();
        String newstr = "" + str1.charAt(0);
        String newstr2 = "";
        int k = 0;
        if (str1.charAt(0) != str2.charAt(0))
            return false;
        while (str2.length() > 1 && k < str1.length() - 1) {
            if (str2.indexOf(ch[k]) != -1) {
                if (str1.charAt(k) == str1.charAt(k + 1)) {
                    newstr2 = str2.substring(str2.indexOf(ch[k]) + 1);
                    if (newstr2.indexOf(ch[k + 1]) == -1) {
                        return false;
                    }

                }
                if (str2.indexOf(ch[k + 1]) != -1) {
                    fin2 += ch[k + 1];
                    newstr += str2.substring(str2.indexOf(ch[k]) + 1, str2.indexOf(ch[k + 1]) + 1);
                    str2 = str2.substring(str2.indexOf(ch[k + 1]));
                } else
                    return false;
            } else
                return false;
            k++;
        }
        return fin.equals(newstr) && fin2.equals(str1);
    }

    public static void main(String[] args) {
        System.out.println(canComplete("bbutl", "beautiful"));
    }
}