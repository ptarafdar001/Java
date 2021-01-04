//String Buffer and String Builder
import java.io.*;
class StrCls5
{
  public static void main(String args[]) throws IOException
  {
   //create empty string buffer object 
   StringBuffer sb=new StringBuffer();

   // accept data from keyboard
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
   // Accept Firstname
   System.out.println("Enter your Firstname");
   String first=br.readLine();
   // Accept Middle name
   System.out.println("Enter your Middlename");
   String mid=br.readLine();
   // Accept Surname
   System.out.println("Enter your Surname");
   String sur=br.readLine();
   //Append First mid and surname to sb object
   sb.append(first);
   //sb.append(mid);
   sb.append(sur);
   System.out.println("Name="+sb);
   int n=first.length();
   sb.insert(n,mid);
   System.out.println(sb);
   //Reverse full name 
   System.out.println(sb.reverse()); 

  }

}
