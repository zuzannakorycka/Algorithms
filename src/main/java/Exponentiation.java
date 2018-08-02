public class Exponentiation {

    public int exponentiationRecursively(int n, int e) {
        if (e == 0) return 1;
        else return n * exponentiationRecursively(n, e - 1);
    }
}
