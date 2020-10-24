public class java3_6 {
    public static boolean same(int[] mas1, int[] mas2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < mas1.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (mas1[i] == mas1[i])
                    break;
            }
            if (i == j)
                sum1++;
        }
        for (int i = 0; i < mas2.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (mas2[i] == mas2[i])
                    break;
            }
            if (i == j)
                sum2++;
        }
        if (sum1 != sum2)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        int[] mas1 = { 1, 3, 4, 4, 4};
        int[] mas2 = { 2, 5, 7};
        System.out.println(same(mas1, mas2));
    }
}