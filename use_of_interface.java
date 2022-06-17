import java.util.Scanner;

public class use_of_interface implements calc{

	Scanner sc=new Scanner(System.in);
	int num1,num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		use_of_interface obj=new use_of_interface();
		obj.method1();
		obj.method2();

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter two No");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1==num2)
		{
			System.out.println("Equal");
		}
		else if(num1>num2)
		{
			System.out.println("Num1 is greater");
		}
		else
		{
			System.out.println("Num2 Is graeter");
		}
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		num1=num1+num2;  //num1=3  4= 7
		num2=num1-num2; // 7-4= num2=3
		num1=num1-num2;// 7-3= num1=4
		
		System.out.println("The swapprd number is ="+num1+" AND "+num2);
		
	}

}
