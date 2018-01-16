import java.util.*;
public class arlength {
	 
	  
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter size of two array's");
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		int arr[]=new int[n];
		int ar[]=new int[m];
		System.out.println("Enter two array's");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		for(int j=0;j<ar.length;j++)
			ar[j]=sc.nextInt();
		if(arr.length>ar.length)
			{System.out.print("longer array is=");
			for(int a=0;a<arr.length;a++)
				System.out.println(arr[a]);
			}
		else {System.out.print("longer array is=");
		for(int b=0;b<arr.length;b++)
			System.out.println(ar[b]);
			
		}
		
		
	}
		}