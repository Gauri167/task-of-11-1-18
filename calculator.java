import java.io.*;

public class calculator {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		System.out.println("add-to find sum of numbers");
		System.out.println("sub-to find diff of numbers");
		System.out.println("mult-to find product of numbers");
		System.out.println("div-to divide numbers");
		System.out.println("Enter numbers");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		System.out.println("Enter choice");
		String str=br.readLine();
		str=str.toLowerCase();
		if(str!="add"||str!="sub"||str!="mult"||str!="div")
			System.out.println("Invalid choice");
		else {
		switch(str)
		{
		case "add":System.out.println("Sum is"+(a+b));
		break;
		case "sub":System.out.println("Diff is"+(a-b));
		break;
		case "mult":System.out.println("Product is"+(a*b));
		break;
		case "div":System.out.println("Quotient is"+(a/b));
		break;
		}
		}

	}

}
