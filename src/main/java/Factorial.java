public class Factorial {

    public int factorialRecursively(int n) {
        if (n == 0) return 1;
        return n * factorialRecursively(n - 1);
    }

    public int factorialIteratively(int n) {
        int score = 1;
        for (int i = 1; i <= n; i++) {
            score += i;
        }
        return score;
    }
}