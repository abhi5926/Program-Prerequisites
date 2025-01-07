import java.util.Scanner;
public class PerimeterOfRactangle{
  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  int length;
  System.out.println("Enter the Length ");
 length =sc.nextInt();
 int width;
  System.out.println("Enter the width");
  width=sc.nextInt();
   
int result = 2 * (length + width);

 System.out.println(" Perimeter Of Ractangle="+result);
  
  

  }
}