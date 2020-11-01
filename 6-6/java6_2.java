
public class java6_2 {
    public static String translateWord(String str) {
        if (str != "") {
            String newstr = "";
            char ch = str.charAt(0);
            str = str.toLowerCase();
            if (str.matches("^(?i:[bcdfghjklmnpqrstvwxyz]).*") == true) {
                while (str.matches("^(?i:[bcdfghjklmnpqrstvwxyz]).*") == true) {
                    newstr += str.charAt(0);
                    str = str.substring(1);
                }
                str += newstr + "ay";
            } else if (str.matches("^(?i:[aeiouy]).*") == true) {
                str += "yay";
            }
            if (Character.toUpperCase(ch) == ch) {
                str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            }
        }
        return str;
    }

    public static String translateSentence(String str) {
        String newstr = (str + " ");
        str = "";
        String s = "";
        while (newstr.length() > 1) {
            if (newstr.matches("^(?i:[bcdfghjklmnpqrstvwxyz]).*") == true
                    || newstr.matches("^(?i:[aeiouy]).*") == true) {
                s += newstr.charAt(0);
                newstr = newstr.substring(1);
            } else {
                str += translateWord(s) + newstr.charAt(0);
                s = "";
                if (newstr.length() > 1)
                    newstr = newstr.substring(1);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(translateWord(""));
        System.out.println(translateSentence(" Buttt|on sdsa dasd ad. "));
    }
}