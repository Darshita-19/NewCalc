import java.util.Scanner;

public class Calculator 
{
	public static int add(int n1,int n2)
	{
		return n1+n2;
	}
	public static int sub(int n1,int n2)
	{
		return n1-n2;
	}
	public static int mul(int n1,int n2)
	{
		return n1*n2;
	}
	public static int div(int n1,int n2)
	{
		return n1/n2;
	}
	public static int percentage(int n1,int n2)
	{
		return (n1*n2)/100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ch=0,res=0;
		Scanner s = new Scanner(System.in);
		while(ch!=7)
		{
			System.out.println("Enter the numbers: ");
			int n1 = s.nextInt();
			int n2 = s.nextInt();
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Percentage");
			System.out.println("6.Exit");
			System.out.println("Enter your choice: ");
			ch = s.nextInt();
			switch(ch)
			{
				case 1: res=add(n1,n2);
						break;
				case 2: res=sub(n1,n2);
						break;
				case 3: res=mul(n1,n2);
						break;
				case 4: res=div(n1,n2);
						break;
				case 5: res=percentage(n1,n2);
						break;
				case 6: System.out.println("Exit");
				default: System.out.println("Invalid choice");
			}
			System.out.println("Result: " +res);
		}
		s.close();
	}

}
