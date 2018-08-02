public class HornerScheme {

    public int horner(int x[], int degree, int a){
        if (degree == 0) return x[0];
        return a*horner(x, degree-1, a) + x[degree];
    }
}
