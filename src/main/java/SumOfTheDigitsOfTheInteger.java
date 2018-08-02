public class SumOfTheDigitsOfTheInteger {

    public int sumOfIntegerRecursively(int n){
        if (n<0) throw new IllegalArgumentException("Only positive number.");
        else if (n>0)return n%10 + sumOfIntegerRecursively(n/10);
        return 0;
    }
}
