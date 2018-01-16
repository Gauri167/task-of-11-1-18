import java.util.*;
public class armstrong{

	 public static void main(String args[])
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a  number");
	   int n=sc.nextInt();
	   int a=n,sum=0;
	   double t, m=0,c=0;
	   while (n>0)
	   {m=n%10;
	    c++;
	    n=n/10;
	   }
	   n=a;
	   while (n>0)
	   {
	    m=n%10;
	  t=Math.pow(m,c);
	    sum=sum+(int)t;
	    n=n/10;
	   }
	   
	   n=a;
	   if(sum==n)
	   {System.out.println("Number is armstrong");}
	   else
	   {System.out.print("Number is not armstrong");}
	  }
}
