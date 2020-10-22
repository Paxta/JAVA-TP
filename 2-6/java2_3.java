public class java2_3 {
    public static boolean func(int mas[]) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        double sredznach = 1.0 * sum / mas.length;
        if (sredznach == (int) sredznach)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int[] mas = { 9, 2, 2, 5 }; 
        System.out.println(func(mas));
    }
}