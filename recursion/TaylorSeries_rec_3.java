public class TaylorSeries_rec_3 {
    static double s=1;
    public static double taylorSeries(double x, int n) {
        if (n == 0) {
            return s; // Base case: e^0 = 1
        } else {
            s=1 + (x * s) / n; // Recursive relation
            return taylorSeries(x, n - 1);
        }
    }
    public static void main(String[] args) {
        int x = 2; // Value at which to evaluate the series
        int n = 5; // Number of terms in the series
        double result = taylorSeries(x, n);
        System.out.println("Taylor Series approximation of e^" + x + " using " + n + " terms is: " + result);
    }
}
