    public class java5_9 {
    public static String toCamelCase(String str) {
        str = str.toLowerCase();
        char[] newstr = str.toCharArray();
        newstr[0] = Character.toUpperCase(newstr[0]);
        str = "";
        for (int i = 0; i < newstr.length; i++) {
            if (newstr[i] == ' ' || newstr[i] == '-') {
                if ((newstr[i + 1] == 'i' && newstr[i + 2] == 'n')
                        || (newstr[i + 1] == 'a' && newstr[i + 2] == 'n' && newstr[i + 3] == 'd')
                        || (newstr[i + 1] == 't' && newstr[i + 2] == 'h' && newstr[i + 3] == 'e')
                        || (newstr[i + 1] == 'o' && newstr[i + 2] == 'f')) {
                } else
                    newstr[i + 1] = Character.toUpperCase(newstr[i + 1]);
            }
            str += newstr[i];
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("jOn SnoW, kINg IN thE noRth."));
    }
}