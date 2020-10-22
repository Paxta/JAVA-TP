public class java2_5 {
    public static int func(String str) {
        int indx = str.indexOf(".");
        if (indx ==-1)
            return 0;
        else  
        {
            str = str.substring(indx +1, str.length());
            return str.length();
        }
        //return str.split("\\.")[1].length();
    }
    public static void main(String[] args) {
        System.out.println(func("400.2020"));
    }
}