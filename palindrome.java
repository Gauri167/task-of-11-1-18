import java.util.*;
public class palindrome {

	 public static void main(String arg[])
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a name");
	   String str=sc.nextLine();
	   String rev="";
	   boolean n;
	   for(int i=str.length()-1;i>=0;i--)
	   {
	    char ch=str.charAt(i);
	    rev=rev+ch;
	   }
	   n=rev.equals(str);
	   if(n==true)
	   System.out.println("Name is palindrome");
	   else
	   System.out.println("Name is not palindrome");
	 }
}
