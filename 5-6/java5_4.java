public class java5_4 {
    public static int sumDigProd(int... mas) {
        int rezult = 0;
        String im = "";
        for (int n : mas)
            rezult += n;
        while (Integer.toString(rezult).length() != 1) {
            im = Integer.toString(rezult);
            rezult = 1;
            for (int i = 0; i < im.length(); i++)
                rezult *= Integer.parseInt(im.substring(i, i + 1));
        }
        return rezult;
    }

    public static void main(String[] args) {
        System.out.println(sumDigProd(99, 999, 9, 4, 5, 6));
    }
}