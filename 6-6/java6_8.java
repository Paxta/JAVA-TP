public class java6_8 {
    public static String convertToRoman(int n) {
        if (n > 3999 && n <= 0)
            return "invailed";
        String res = "";
        while (n >= 1000) {
            n -= 1000;
            res += "M";
        }
        if (n >= 900) {
            n -= 900;
            res += "CM";
        }
        if (n >= 500) {
            n -= 500;
            res += "D";
        }
        if (n >= 400) {
            n -= 400;
            res += "CD";
        }
        while (n >= 100) {
            n -= 100;
            res += "C";
        }
        if (n >= 90) {
            n -= 90;
            res += "XC";
        }
        if (n >= 50) {
            n -= 50;
            res += "L";
        }
        if (n >= 40) {
            n -= 40;
            res += "XL";
        }
        while (n >= 10) {
            n -= 10;
            res += "X";
        }
        if (n == 9) {
            n -= 9;
            res += "IX";
        }
        if (n >= 5) {
            n -= 5;
            res += "V";
        }
        if (n == 4) {
            n -= 4;
            res += "IV";
        }
        while (n >= 1) {
            n -= 1;
            res += "I";
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(convertToRoman(98));
    }
}   