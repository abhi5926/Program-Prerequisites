import java.util.Scanner;
public class Fahrenheit{
  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  int Celsius;
  System.out.println("Enter the temperature in Celsius");
 Celsius =sc.nextInt();
 int Fahrenheit= (Celsius * 9/5) + 32;
 System.out.println(" Fahrenheit="+Fahrenheit);
  
  

  }
}