public class java4_6 {
    public static int bugger(int n) {
        String str = "" + n;
        int sum = 0;
        int s = 0;
        while (str.length() > 1) {
            sum = 1;
            for (int i = 0; i < str.length(); i++) {
               sum = sum * Integer.parseInt("" +str.charAt(i));
            }
            s++;
            str = "" + sum;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(bugger(999));
    }
}