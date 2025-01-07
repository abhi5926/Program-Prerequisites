import java.util.Scanner;

public class PowerCalculator {

    
    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the base ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent ");
        int exponent = scanner.nextInt();

        
        double result = power(base, exponent);

        
        System.out.println(" result of base raised to the exponent= " + result);
        scanner.close();
    }
}
