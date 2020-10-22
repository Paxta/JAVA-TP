public class java1_9 {
    public static int func(int mas[]) {
        int kub = 0;
        for (int i = 0; i < mas.length; i++) {
            kub += Math.pow(mas[i], 3);
        }
        return kub;
    }

    public static void main(String[] args) {
        int[] mas = { 3, 4, 5, 6 };
        System.out.println(func(mas));
    }
}