public class java2_1 {
    public static String func(String str, int a) {
        String strs = "";
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < a; j++) {
                strs += arr[i];
            }
        }
        return strs;
    }

    public static void main(String[] args) {
        System.out.println(func("hello,world", 3));
    }
}