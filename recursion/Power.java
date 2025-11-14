import java.util.Scanner;
class Power{
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        int base = sc.nextInt();

        System.out.println("Exponent: ");
        int exponent = sc.nextInt();

        int result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        sc.close();

}
}