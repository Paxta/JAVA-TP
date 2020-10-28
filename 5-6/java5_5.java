public class java5_5 {
    public static String sameVowelGroup(String[] mas) {
        String str = mas[0];
        String pervoeSlovo = "";
        String sledSovo = "";
        String sl = "";
        String Otvet = "['" + str + "',";
        boolean a = true;
        int k1 = 0, k2 = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'y') {
                if (pervoeSlovo.indexOf(str.charAt(i)) == -1)
                    k1++;
                pervoeSlovo += str.charAt(i);
            }
        }
        for (int i = 1; i < mas.length; i++) {
            sledSovo = mas[i].toLowerCase();
            for (int j = 0; j < sledSovo.length(); j++) {
                if (sledSovo.charAt(j) == 'a' || sledSovo.charAt(j) == 'e' || sledSovo.charAt(j) == 'i'
                        || sledSovo.charAt(j) == 'o' || sledSovo.charAt(j) == 'u' || sledSovo.charAt(j) == 'y') {
                    if (pervoeSlovo.indexOf(sledSovo.charAt(j)) != -1) {
                        if (sl.indexOf(sledSovo.charAt(j)) == -1) {
                            k2++;
                        }
                        sl += sledSovo.charAt(j);
                    } else
                        a = false;
                }
            }
            if (a == true && k1 == k2) {
                Otvet += "'" + sledSovo + ",'";
            }
            a = true;
            k2 = 0;
            sl = "";
        }
        return Otvet.substring(0, Otvet.length() - 2) + "']";
    }

    public static void main(String[] args) {
        String[] mas = { "hoops", "chuff", "bot", "bottom" };
        System.out.println(sameVowelGroup(mas));
    }
}