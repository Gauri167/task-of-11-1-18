import java.util.*;
public class sorting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter size of array");
	      int n=sc.nextInt();
	      System.out.println("Enter an array");
	      int arr[]=new int[n];
	      for(int k=0;k<n;k++)
	       arr[k]=sc.nextInt();
	      int temp=0;
	      for(int i=0;i<n;i++)
	      {
	       for(int j=0;j<n-1;j++)
	       {
	    	if(arr[j]>arr[j+1]) 
	    	{
	    	  temp=arr[j];
	          arr[j]=arr[j+1];
	          arr[j+1]=temp;
	        }
	       }
	      }
	     for(int a=0;a<n;a++)
	     System.out.println(arr[a]);



	}

}
