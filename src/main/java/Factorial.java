public class Factorial {

    public int factorialRecursively(int n){
        if (n==0) return 1;
        return n*factorialRecursively(n-1);
    }

}
