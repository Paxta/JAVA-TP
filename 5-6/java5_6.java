public class java5_6 {
    public static boolean validateCard(long num) {
        if (("" + num).length() <= 14 && ("" + num).length() >= 19) {
            return false;
        }
        String s;
        int sum = 0;
        int kontrolChifra = Integer.parseInt(("" + num).substring(("" + num).length() - 1));// Последняя цифра
        int len = ("" + num).length() - 2;
        while (len >= 0) {
            s = "" + ("" + num).charAt(len);//Переворот цифр
            if (Integer.parseInt(s) % 2 != 0) {
                s = "" + Integer.parseInt(s) * 2;
                if (s.length() > 1) {
                    s = "" + (Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(1, 2)));
                }
            }
            sum += Integer.parseInt(s);
            len--;
        }
        return ("" + (10 - Integer.parseInt(("" + sum).substring(("" + sum).length() - 1)))).equals("" + kontrolChifra);
    }

    public static void main(String[] args) {
        System.out.println(validateCard(1234567890123456L));
    }
}