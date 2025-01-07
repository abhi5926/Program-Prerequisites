import java.util.Scanner;
public class Addition{
  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  int a;
  System.out.println("Enter the first number");
  a=sc.nextInt();
  int b;
  System.out.println("Enter the second number");
  b=sc.nextInt();
  System.out.println("Addition of two number ="+ (a+b));

  }
}