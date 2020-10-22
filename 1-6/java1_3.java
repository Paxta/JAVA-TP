public class java1_3 {
    public static int legs_kol(int chickens, int cows, int pigs) {
        int legs = 2 * chickens + 4 * cows + 4 * pigs;
        return legs;
    }

    public static void main(String[] args) {

        System.out.println(legs_kol(2, 4, 4));
    }
}