import java.util.*;
public class copyar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter an array");
       for(int i=0;i<arr.length;i++)
    	   arr[i]=sc.nextInt();
       int ar[]=new int[arr.length];
       System.out.println("Copied array is=");
       for(int j=0;j<arr.length;j++)
       { ar[j]=arr[j];
         System.out.println(ar[j]);
       }
       
	}

}
