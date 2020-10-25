public class java4_7 {
    public static String toStarShorthand(String str) {
        if(str=="")
            return "";
        char save = str.charAt(0);
        int kol = 1;
        String newst = "";
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i) != save)
            {
                if(kol>1)
                {
                    newst += ""+save+ "*"+ kol;
                }
                else
                    newst += ""+save;
                kol = 1;
                if(i!=str.length()-1)
                    save = str.charAt(i);
                else
                    newst+=str.charAt(i);
            }
            else
            {
                kol++;
                if(i== str.length()-1)
                {
                    newst += ""+save+ "*"+ kol;
                }
            }
        }
        return newst;
    }
    public static void main(String[] args) {
        System.out.println(toStarShorthand(""));
    }
}