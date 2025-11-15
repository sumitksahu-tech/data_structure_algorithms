public class Fib_iter_1 {

    public static int fib(int n){
        if(n <= 1) return n;

        int t0 = 0;
        int t1 = 1;

        for(int i = 2; i <= n; i++){
            int s = t0 + t1;
            t0 = t1;
            t1 = s;
        }
        return t1;
    }
    public static void main(String[] args){
        System.out.println("fib: " +fib(15)); // Output: 55

    }
}
