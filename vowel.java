import java.util.*;
public class vowel {
	public static void main(String arg[])
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a word");
	   String str=sc.nextLine();
	   str=str.toLowerCase();
	   for(int i=0;i<str.length();i++)
	   {
	    char ch=str.charAt(i);
	    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	     System.out.println("It is a vowel"+ch);
	    else
	     System.out.println("It is a consonant"+ch);
	   }
	}
}
