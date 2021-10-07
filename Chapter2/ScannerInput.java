/*The program demonstrates how to take Input using scanner class*/
import java.util.Scanner;
public class ScannerInput{
	public static void main(String args[]){
	
		Scanner scn = new Scanner(System.in);
		
		// Calculating the maximum two numbers in Java 
		System.out.println("Please enter two numbers to find maximum of two"); 
			int a = scn.nextInt(); 
			int b = scn.nextInt();
		if(a>b)
			System.out.printf("Between %d and %d, max is %d \n", a, b, a);
		else
			System.out.printf("Between %d and %d, max is %d \n", a, b, b);
	}
}
