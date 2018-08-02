public class Exponentiation {

    public double exponentiationRecursively(double n, double e) {
        if (e == 0) return 1;
        else if (e>0 )return n * exponentiationRecursively(n, e - 1);
        else return exponentiationRecursively(1/n, -e);
    }
}
