import java.util.Scanner;

public class Function_demo 
{
	int num1,num2,sum,res;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Function_demo obj=new Function_demo();
		//obj.sqr();
		obj.add();
		
	}
	public void hello_world()
	{
		System.out.println("This is the hellow world block ....");
	}
	public int add()
	{
		
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum=num1+num2;

		System.out.println("Add of two numbers is ="+sum);
		return sum;
	}
	
	public void sqr()
	{
		res=add();
		System.out.println("The square is ="+ res*res);
	}
	
	public void evenodd()
	{
		System.out.println("Enter a numbers");
		num1=sc.nextInt();
		if(num1%2==0)
		{
			System.out.println("It is even");
		}
		else
		{
			System.out.println("It is Odd");
		}
	}
}
