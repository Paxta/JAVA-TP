public class java3_5 {
    public static boolean isValidHexCod(String str) {
        if (str.matches("(#[a-fA-F0-9]{1,6})"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValidHexCod("#CD5C5C"));
        System.out.println(isValidHexCod("#EAECEE"));
        System.out.println(isValidHexCod("#eaecee"));
        System.out.println(isValidHexCod("#CD5C58C"));
        System.out.println(isValidHexCod("#CD5C5Z"));
        System.out.println(isValidHexCod("CD5C5C"));
    }
}