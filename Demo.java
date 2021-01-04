//Calling a method and returning the result from the method
class Demo
{
	public static void main(String args[])
	{
		//call myMethod() and catch the result into res.
		//since myMethod() is static, We can call it using classname.methodname() 
		int res = Demo.myMethod(10);
		//display the result now.
		System.out.println("Result= " +res);
	}

	//this method calculates square value and return it to main()

	static int myMethod(int num)
	{
		return num*num;
	}
}
