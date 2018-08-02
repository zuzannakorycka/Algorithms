public class Exponentiation {

    public double exponentiationRecursively(double n, double e) {
        if (e > 0) return n * exponentiationRecursively(n, e - 1);
        else if (e < 0) return exponentiationRecursively(1 / n, -e);
        else return 1;
    }

    public double exponentiationIteratively(double n, double e) {
        double score = 1;
        if (e > 0) {
            while (e > 0) {
                score = n * score;
                e--;
            }
        } else if (e < 0) {
            while (e < 0) {
                score = 1 / n * score;
                e++;
            }
        }
        return score;
    }
}
