public class PrimeNumber {

    public boolean primeNumber(int n) {
        int count=0;
        for (int i=2; i<Math.sqrt(n); i++)
            if (n%i==0) count++;
        if (count==0) return true;
        else return false;
    }
}
