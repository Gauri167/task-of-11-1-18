import java.util.*;
public class pattern3 {
	public static void main(String arg[])
	 {
	   Scanner sc=new Scanner(System.in);
	   int sp=3,c=7,t=1;
	   
	   for(int i=1;i<=3;i++)
	   {
	   for(int j=sp;j>0;j--)
		   System.out.print(" ");
	   for(int k=1;k<=t;k+=1)
	    System.out.print("*");
	   System.out.println();
	   sp-=1;
	   t=t+2;
	   }
	   
	   for(int a=4;a>=1;a--)
	   {
		   for(int j=1;j<sp+1;j++)
	        System.out.print(" ");
	     for(int k=c;k>=1;k-=1)
	      System.out.print("*");
	    c-=2;
	     System.out.println();
	     sp=sp+1;
	   }
}
}
