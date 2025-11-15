class TaylorSeries_1{
    static double pow=1, fact=1;
    public static double taylorSeriesExp(double x, int n){
        double r;
        if (n==0)
            return 1;
        else{
            r = taylorSeriesExp(x, n-1);
            pow = pow*x;
            fact = fact*n;
            return r + pow/fact;
        }
    }

    public static void main(String[] args) {
        double x = 2.0; // Value at which to evaluate the series
        int n = 15;    // Number of terms in the series

        double result = taylorSeriesExp(x, n);
        System.out.println("e^" + x + " approximated using Taylor series with " + n + " terms is: " + result);
    }
}