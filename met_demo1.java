import java.util.Scanner;

public class met_demo1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		area();
	}
	public static void area()
	{
		Scanner sc=new Scanner(System.in);
		int l,b;
		double r;
		System.out.println("Enter R:");
		r=sc.nextDouble();
		area(r);
		System.out.println("Enter the value of l");
		l=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		area(l,b);
	}
	public static void area(double r)
	{
		double res,pi=3.14;
		res=pi*r*r;
		System.out.println("The area of circle is ="+res);
	}
	public static void area(int l,int b)
	{
		int res;
		res=l*b;
		System.out.println("The area of rectangle is ="+res);
		
	}
	
}
