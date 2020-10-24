public class java3_4 {
    public static String flipEndChars(String str) {
        if(str.length()<2)
            return "Incompatible";
        if (str.charAt(0)==str.charAt(str.length()-1))
            return "Two's a pair.";
        str = str.charAt(str.length()-1)+str.substring(1, str.length()-1)+str.charAt(0);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(flipEndChars("Cat, dog, and mouse."));
    }
}