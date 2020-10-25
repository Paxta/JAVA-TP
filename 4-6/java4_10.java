public class java4_10 {
    public static int countUniqueBooks(String str, char ch) {
        String newstr1 = "";
        String newstr2 = "";
        String fin = "";
        int ind1 = 0, ind2 = 0;
        while(str.length()!= 0)
        {
            if(str.indexOf(ch)!=-1)
            {
                newstr1 = str.substring(str.indexOf(ch)+1);
                ind1 = str.indexOf(ch)+1;
                str = str.substring(ind1);
            }
            if(newstr1.indexOf(ch)!=-1)
            {
                newstr2 = newstr1.substring(0,newstr1.indexOf(ch));
                ind2 = newstr1.indexOf(ch)+1;
                str = str.substring(ind2);
            }
            for(int i=0;i<newstr2.length();i++)
            {
                if(fin.indexOf(newstr2.charAt(i))==-1)
                {
                    fin += newstr2.charAt(i);
                }
            }
        }
        return fin.length();
    }
    public static void main(String[] args) {
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
    }
}