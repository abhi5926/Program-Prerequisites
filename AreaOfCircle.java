import java.util.Scanner;
public class AreaOfCircle{
  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  int radius;
  System.out.println("Enter the radius ");
 radius =sc.nextInt();
 int p=radius * radius;
 double area = 3.14 * p;
 System.out.println(" Area of Circle="+area);
  
  

  }
}