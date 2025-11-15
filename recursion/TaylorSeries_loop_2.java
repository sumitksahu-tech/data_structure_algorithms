public class TaylorSeries_loop_2 {

    public static double taylorSeriesExp(double x, int n) {
        double result = 1.0;
        for (int i=n; i>0; i--) {
            result = 1+(result*x)/i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Taylor series
        double x = 1.0; // Value at which to evaluate the series
        System.out.println("The Taylor series approximation of e^" + x + " is: " + taylorSeriesExp(x, n));
    }
}
