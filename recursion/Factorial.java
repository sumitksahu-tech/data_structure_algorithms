import java.util.Scanner;
import java.math.BigInteger;

class Factorial {

    public static BigInteger fact(int n) {
        if (n <= 0) {
            return BigInteger.ONE;
        } else {
            return fact(n - 1).multiply(BigInteger.valueOf(n));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + fact(n));
        sc.close();
    }
}