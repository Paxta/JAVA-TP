public class java4_5 {
    public static String BMI(String str1, String str2) {
        double ves = Double.parseDouble(str1.substring(0, str1.indexOf(' ')));
        if (str1.endsWith("pounds")) {
            ves = ves * 0.453592;
        }
        double rost = Double.parseDouble(str2.substring(0, str2.indexOf(' ')));
        if (str2.endsWith("inches")) {
            rost = rost * 0.0254;
        }
        double IBM = ves / Math.pow(rost, 2);
        if (IBM < 18.5) {
            return String.format("%.1f", IBM) + " NeDostatochnyi Ves";
        }
        else if(IBM<24.9)
            return String.format("%.1f", IBM)+ " Normalniy Ves";
        else
            return String.format("%.1f", IBM)+ " Izbitochniy Ves";

    }

    public static void main(String[] args) {
        System.out.println(BMI("205 pounds", "73 inches"));
        System.out.println(BMI("55 kilos", "1.65 meters"));
        System.out.println(BMI("154 pounds", "2 meters"));
    }
}