// TestArray.java
class TestArray{
	public static void main(String args[]){
		int a[]={10, 20, 30, 40, 50};         //Initialization
		//Traversing array 
		for(int i=0; i<a.length; i++){        //length is the property of array  
			System.out.print(a[i]+" ");
		}
		System.out.println();
		// Average calculation
		float sum = 0, avg;
		for(int i=0; i<a.length; i++)      //Calculating the sum of the numbers  
			sum += a[i];
		avg = sum/a.length;
		System.out.println("Average = " +avg);
		
	}
}
