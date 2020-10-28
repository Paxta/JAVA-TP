public class java5_1 {
    public static String encrypt(String str) {
        char[] ch = str.toCharArray();
        String newstr = "[" + (int) ch[0] + ", ";
        for (int i = 1; i < ch.length; i++) {
            newstr += (int) ch[i] - (int) ch[i - 1] + ", ";
        }
        return newstr.substring(0, newstr.length() - 2) + "]";
    }

    public static String decrypt(int[] mas) {
        String newstr = "" + (char) mas[0];
        int sum = mas[0];
        for (int i = 1; i < mas.length; i++) {
            sum += mas[i];
            newstr += (char) sum;
        }
        return newstr;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("Hello"));
        int[] mas = { 72, 33, -73, 84, -12, -3, 13, -13, -68 };
        System.out.println(decrypt(mas));
    }
}