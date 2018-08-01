public class PrimeNumber {

    public boolean primeNumberIteratively(int n) {
        int count=0;
        for (int i=2; i<Math.sqrt(n); i++)
            if (n%i==0) count++;
        if (count==0) return true;
        else return false;
    }

    public boolean primeNumberRecursively(int n, int i){
        if (i==1) return true;
        else if (n%i==0) return false;
        else return primeNumberRecursively(n, i-1);
    }
}
