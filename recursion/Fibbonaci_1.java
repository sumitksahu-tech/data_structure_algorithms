import java.util.Arrays;
public class Fibbonaci_1 {

    public static int ifib(int n) {
        if (n <= 1) {
            return n;
        }
            int t0=0;
            int t1=1;
            int t2=0;
        for (int i=2; i<=n; i++) {
            t2=t0+t1;
            t0=t1;
            t1=t2;
        }
        return t2;
    }

    public static int rfib(int n) {
        if (n<=1) {
            return n;
        }
        else {
            return rfib(n-1)+rfib(n-2);
        }
    }

    static int[] F;
    public static int mfib(int n){
        if (F==null || F.length<n+1){
            F=new int[n+1];
            Arrays.fill(F,-1);
        }
        if (n<=1){
            return F[n]=n;
        }
        if (F[n]!=-1){
            return F[n];
        }
        F[n] =mfib(n-1)+mfib(n-2);
        return F[n];
    }
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Sequence up to " + n + " terms using iteration:"+ifib(n));
        System.out.println("Fibonacci Sequence up to " + n + " terms using recursion:"+rfib(n));
        System.out.println("Fibonacci Sequence up to " + n + " terms using memonization:"+mfib(n));
        }
    }
