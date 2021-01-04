//Employee Details
import java.io.*;
class Buff
{
	public static void main(String args[]) throws IOException
	{
		//chech BufferedReader object to accept data.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Accept employee details.
		System.out.print("Enter id: ");
		int id=Integer.parseInt(br.readLine());

		System.out.print("Enter Gender (M/F): ");
		char gen = (char)br.read();
		//solution1: 
		//char gen = br.readLine().charAt(0);

		//solution2: skip two characters 
		 //br.skip(3);
		
		System.out.print("Enter Name: ");
		String name = br.readLine();

		//Display the employee details.
		System.out.println("Id=" +id);
		System.out.println("Gen=" +gen);
		System.out.println("Name=" +name);
		}

}

