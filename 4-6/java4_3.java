public class java4_3 {
    public static String toCamelCase(String str) {
        char[] newstr = str.toCharArray();
        str = "";
        for (int i = 0; i < newstr.length; i++) {
            if (newstr[i] == '_')
                newstr[i + 1] = Character.toUpperCase(newstr[i + 1]);
            else
                str += newstr[i];
        }
        return str;
    }

    public static String toSnakeCase(String str) {
        char[] newstr = str.toCharArray();
        str = "";
        for (int i = 0; i < newstr.length; i++) {
            if (Character.isUpperCase(newstr[i])) {
                str += "_" + Character.toLowerCase(newstr[i]);
            } else
                str += newstr[i];
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("is_modal_open"));
        System.out.println(toSnakeCase("helloEdabitBruh"));
    }
}