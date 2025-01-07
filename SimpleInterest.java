import java.util.Scanner;
public class SimpleInterest{
  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  double principal;
  System.out.println("Enter the Principle Amount ");
 principal =sc.nextInt();
 double rate;
  System.out.println("Enter the Rate of Parcent");
  rate=sc.nextInt();
   int time;
  System.out.println("Enter the Time");
  time=sc.nextInt();
double result = (principal * rate * time) / 100;

 System.out.println(" Simple Interest="+result);
  
  

  }
}