public class java6_10 {
    public static boolean formula(int n) {
        String str = "" + n;
        String newstr1="";
        String newstr2="";
        int a = 0;
        String newstr3 = "";
        while (str.length() > 1) {
            if(str.length()%2!=0)
            {
                newstr1 = str.substring(0,(int)str.length()/2+1);
                a = newstr1.length();
                while (a!=0) 
                {
                    a--;
                    newstr2 += newstr1.charAt(a);
                }                
                if(newstr2.equals(str.substring((int)str.length()/2)))
                    return true;
                else
                    return false;
            }
            else
            {
                newstr1 = str.substring(0,str.length()/2);
                a = newstr1.length();
                while (a!=0) 
                {
                    a--;
                    newstr2 += newstr1.charAt(a);
                }
                if(newstr2.equals(str.substring((int)str.length()/2)))
                    return true;
                else
                {
                    for (int i=0; i<str.length(); i+=2) 
                    {
                        newstr3 += Integer.toString(Integer.parseInt(str.substring(i,i+1)) + Integer.parseInt(str.substring(i+1,i+2)));
                    }
                    str = newstr3;
                }
                newstr1 = "";
                newstr2 = "";
                newstr3 = "";
                a=0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(formula(123312));
    }
}