
class StrCls1
{

public static void main(String args[])
{
  // Create string in different ways
  String s1="Purulia Government Engineering College ";
  String s2= new String("RKM Government Engineering College Purulia");
  char arr[]={'C','o','m','p','u','t','e','r',' ', 'S','c','i','e','n','c','e'};
  String s3= new String(arr);
  
  //Display all strings

  System.out.println(s1);
  System.out.println(s2);
  System.out.println(s3);
  
  // Find the length of the first string
  System.out.println("Length of s1="+s1.length());

  // Concatenate two strings 
  System.out.println("Concatenate s1 and s2 as ="+s1.concat(s2));

  // Test if string s1 starts with P
  boolean b=s1.startsWith("P");
  if(b) System.out.println("s1 starts with 'P'");
  else  System.out.println("s1 does not starts with \'P\'");

  // Extract substring from string 
  String p= s1.substring(0,7);
  String q= s3.substring(9,16);
  System.out.println(p+q);
  
  //Convert Uppercase & lowercase
  System.out.println("Upper s1="+s1.toUpperCase());
  System.out.println("Lower s2="+s2.toLowerCase());
   
}

}
