import java.util.Scanner;

class NaturalNumberSum {

public static int sum(int n) {
    if (n<=0){
        return 0;
    }else{
        return sum(n-1)+n;
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.println("Natural Number Sum Calculator");
    System.out.println("============================");
        
    System.out.print("Enter a positive number: ");
    int n = scanner.nextInt();
        
    int result = sum(n);
        
    System.out.println("\nSum of natural numbers from 1 to " + n + " = " + result);

    scanner.close();

}
}