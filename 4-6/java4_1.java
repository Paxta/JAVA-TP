public class java4_1 {
    public static String nextPrime(int n, int k, String str) {
        String newstr = "";
        String str2 = "";
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < str.length(); i++) {
            sum++;
            if (str.charAt(i) == ' ') {
                str2 = str.substring(i);
                sum2 = str2.split("\\ ")[1].length();
                sum--;
            }
            if (sum+sum2<= k) {
                sum2=0;
                newstr += str.charAt(i);
            } else if(str.charAt(i) != ' '){
                newstr += "\n" + str.charAt(i);
                sum = 0;
            }
        }
        return newstr;

    }

    public static void main(String[] args) {
        System.out.println(nextPrime(10, 7, "hello my name is Bessie and this is my essay"));
    }
}