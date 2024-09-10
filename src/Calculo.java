public class Calculo {

    public static long[] gerarFibonacci (int n) {
        long[] fib = new long[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }

    public static boolean confirmar(int number, long[] fib) {
        for (int i = 0; i < fib.length; i++) {
            if (fib[i] == number) return true;
        }
        return false;
    }
}




