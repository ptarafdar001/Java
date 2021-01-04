//Input through passing command line argument
class Cmd
{
	public static void main(String args[])
	{
                
		//chech if 2 args are not entered come out.
		if(args.length !=2)
		{
			System.out.println("Please enter values");
			return;
		}
		//take the number from args.
		//they would be in string form.
		
		String s1 = args[0];
		String s2 = args[1];

		//Convert them into numerics.
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);

		//add them and display.
		double d3 = d1 + d2;
		System.out.println("The sum = " +d3);
	}
}
