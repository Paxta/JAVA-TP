public class java3_9 {
    public static int nextPrime(int N) {
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                i = 2;
                N=N+1;
            }
        }
        return N;
    }

    public static void main(String[] args) {
        System.out.println(nextPrime(24));
    }
}