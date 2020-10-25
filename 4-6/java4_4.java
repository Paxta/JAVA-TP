public class java4_4 {
    public static String overTime(double x, double y, double c, double dp) {
        String dolar = "$";
        double s = 0;
        if (y > 17) {

            s = y - 17;
            s = (y - x - s) * c + (s * 30 * dp);
        } else {
            s = (y - x) * c;
        }
        return dolar + String.format("%.2f", s);
    }

    public static void main(String[] args) {
        System.out.println(overTime(13.25, 15, 30, 1.5));
    }
}