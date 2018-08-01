public class SumOfASequenceOfIntegers {

    public int sumRecursively(int n){
        if (n<0) throw new IllegalArgumentException("Only positive number.");
        else if (n>0) return n+sumRecursively(n);
        return 0;
    }
}
