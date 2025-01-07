import java.util.Scanner;

public class ConvertKilometer{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the Distance in Kilometer ");
        double distance = scanner.nextDouble();

       
        double result = distance * 0.621371;

       
        System.out.println("Kilometer Distance in  miles =" + result);

        
    }
}
