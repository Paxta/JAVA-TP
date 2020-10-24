public class java3_8 {
    public static String longestZero(String str) {
        int min = 0;
        int max = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                index1 = i + 1;
                min++;
                if (min > max) {
                    max = min;
                    index2 = index1;
                }
            }else {
                min = 0;
            }
        }
        return str.substring(index2 - max, index2);
    }

    public static void main(String[] args) {
        System.out.println(longestZero("01110001100000"));
    }
}