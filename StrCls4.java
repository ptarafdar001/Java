//immutability of string
class StrCls4
{

  public static void main(String args[])
  {
    String s1="RKM ";
    String s2= "Government Engineering College";
    System.out.println("Hash code of s1= "+s1.hashCode());
    System.out.println("Hash code of s2= "+s2.hashCode());
    s1=s1+s2;
    System.out.println("Hash code of s1= "+s1.hashCode());
    System.out.println("Hash code of s2= "+s2.hashCode());
    //Immutable or mutable ?  String class is made 'final' class
    System.out.println(s1);
      
  }

}
