public class java6_5 {
    public static String getHashTags(String str) {
        String newstr2 = str;
        String newstr3 = "";
        while (newstr2.length() >= 1) {
            if (newstr2.matches("^(?i:[bcdfghjklmnpqrstvwxyz ]).*") == true
                    || newstr2.matches("^(?i:[aeiouy ]).*") == true) {
                newstr3 += newstr2.charAt(0);
            }
            newstr2 = newstr2.substring(1);
        }
        newstr2 = newstr3.toLowerCase()+" ";
        String newstr = "";
        String[] mas = { "", "", "" };
        while (newstr2.length() > 1) {
            newstr = newstr2.substring(0, newstr2.indexOf(" "));
            newstr2 = newstr2.substring(newstr2.indexOf(" ") + 1);
            if (newstr.length() > mas[0].length()) {
                mas[0] = newstr;
            }
        }
        newstr2 = newstr3.toLowerCase()+" ";
        while (newstr2.length() > 1) {
            newstr = newstr2.substring(0, newstr2.indexOf(" "));
            newstr2 = newstr2.substring(newstr2.indexOf(" ") + 1);
            if (newstr.length() > mas[1].length() && newstr.equals(mas[0]) == false) {
                mas[1] = newstr;
            }
        }
        newstr2 = newstr3.toLowerCase()+" ";
        while (newstr2.length() > 1) {
            newstr = newstr2.substring(0, newstr2.indexOf(" "));
            newstr2 = newstr2.substring(newstr2.indexOf(" ") + 1);
            if (newstr.length() > mas[2].length() && newstr.equals(mas[0]) == false && newstr.equals(mas[1]) == false) {
                mas[2] = newstr;
            }
        }
        if (mas[0].equals(""))
            return "";
        if (mas[1].equals(""))
            return "['#" + mas[0] + "']";
        if (mas[2].equals(""))
            return "['#" + mas[0] + "', '#" + mas[1] + "']";
        return "['#" + mas[0] + "', '#" + mas[1] + "', '#" + mas[2] + "']";
    }

    public static void main(String[] args) {
        System.out.println(getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit"));
    }
}