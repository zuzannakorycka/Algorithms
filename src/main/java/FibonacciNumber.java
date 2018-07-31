public class FibonacciNumber {

    public int fibonacciRecursively(int n) {
        if (n == 0 || n == 1) return n;
        else return fibonacciRecursively(n - 1) + fibonacciRecursively(n - 2);
        //This method can be save also like this: return n>2 ? n : fibonacciRecursively(n-1) + fibonacciRecursively(n-2);
    }

    public int fibonacciIteratively(int n) {
        int a = 0, b = 1, result = 0;
        if (n < 2) return n;
        else {
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }

}
