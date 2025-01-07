import java.util.Scanner;
public class VolumeOfCylinder{
  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  double radius;
  System.out.println("Enter the radius ");
 radius =sc.nextInt();
 double height;
  System.out.println("Enter the height ");
  height=sc.nextInt();
double volume = 3.14* (radius*radius) * height;
 System.out.println(" Volume of Cylinder="+volume);
  
  

  }
}