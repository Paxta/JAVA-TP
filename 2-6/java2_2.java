public class java2_2 {
    public static int func(int mas[]) {
        int max = mas[0];
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (max < mas[i])
                max = mas[i];
            if (min > mas[i])
                min = mas[i];
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] mas = { 44, 32, 86, 19 };
        System.out.println(func(mas));
    }
}