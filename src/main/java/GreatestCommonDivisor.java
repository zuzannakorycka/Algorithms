public class GreatestCommonDivisor {

    public int gcdRecursively(int n, int m){
        if (n!=m) return gcdRecursively(n>m? n-m:n, m>n? m-n:m);
        return n;
    }

}
