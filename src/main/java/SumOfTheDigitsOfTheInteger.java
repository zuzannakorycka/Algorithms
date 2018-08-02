public class SumOfTheDigitsOfTheInteger {

    public int sumOfIntegerRecursively(int n) {
        if (n < 0) throw new IllegalArgumentException("Only positive number.");
        else if (n > 0) return n % 10 + sumOfIntegerRecursively(n / 10);
        return 0;
    }

    public int sumOfIntegerIteratively(int n) {
        int s = 0;
        int c = 0;
        String n_string = String.valueOf(n);
        if (n < 0) throw new IllegalArgumentException("Only positive number.");
        else if (n > 0) {
            for (int i = 0; i < n_string.length(); i++) {
                c = n % 10;
                n = n / 10;
                s += c;
            }
        }
        return s;
    }
}
