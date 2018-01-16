import java.io.*;
import java.util.*;
public class revstr {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array");
int n=sc.nextInt();
String arr[]=new String[n];
System.out.println("Enter an array");
for(int i=0;i<arr.length;i++)
	   arr[i]=br.readLine();
String rev[]=new String[arr.length];
String a="";

	int k=rev.length-1;
for(int j=0;j<rev.length;j++)
{
	
	a=arr[k];
	      rev[j]=a;
	      k--;
}

System.out.println("Reverse array is=");
for(int b=0;b<rev.length;b++)
	System.out.println(rev[b]);
	}
}
	
	


