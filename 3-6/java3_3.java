public class java3_3 {
    public static boolean checkPerfec(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
                sum += i;
        }
        if(sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfec(496));
    }
}