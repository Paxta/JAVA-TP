public class java2_4 {
    public static void func(int mas[]) {
        int sum = 0;
        int[] mas2 = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            sum = mas[i];
            for (int j = 0; j < i; j++) {
                sum += mas[j];
            }
            mas2[i] = sum;
        }
        for (int i = 0; i < mas2.length; i++) {
            System.out.println(mas2[i]);
        }
    }

    public static void main(String[] args) {
        int[] mas = { 1, 2, 3 };
        func(mas);
    }
}