/*The following program snippet shows how to read and write to the console.*/
import java.util.*;

public class ReadWriteConsole
{
  public static void main ( String args[] ) 
  {
    System.out.print ( "Enter the radius: " );

    Scanner sc = new Scanner (System.in);

    double radius = sc.nextDouble();

    double area = 3.14159 * radius * radius;

    System.out.println ( "Area is: " + area );
  }
}

