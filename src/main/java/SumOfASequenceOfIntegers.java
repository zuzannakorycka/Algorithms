public class SumOfASequenceOfIntegers {

    public int sumRecursively(int n){
        if (n<0) throw new IllegalArgumentException("Only positive number.");
        else if (n>0) return n+sumRecursively(n-1);
        return 0;
    }

    public int sumIteratively(int n){
        int s = 0;
        if (n<0) throw new IllegalArgumentException("Only positive number.");
        else {
            for (int i = 1; i<=n; i++)
                s+=i;
            return s;
        }
    }
}
