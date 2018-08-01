public class GreatestCommonDivisor {

    public int gcdRecursively(int n, int m){
        if (n!=m) return gcdRecursively(n>m? n-m:n, m>n? m-n:m);
        return n;
    }

    public int gdcIteratively(int n, int m){
        while (n!=m){
            if (n>m) n-=m;
            else m-=n;
        }
        return n;
    }

}
