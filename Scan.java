//Scanner to scan the input from keyboard
import java.util.Scanner;
class Scan
{
	public static void main(String args[])
	{
		System.out.print("Enter id name sal: ");
		Scanner sc = new Scanner(System.in);

		int id = sc.nextInt();
		String name = sc.next();
		float sal = sc.nextFloat();

		System.out.println("Id=" +id);
		System.out.println("Name=" +name);
		System.out.println("sal=" +sal);
		
	}
}
