package NOV_2019;

public class Constructor 
{

	public Constructor()
	{
		System.out.println("Default constructor");
	}
	public Constructor(int a)
	{
		int a1=a;
		System.out.println("One parameterized constructor");
		System.out.println("value of a is = "+a1);
	}
	public Constructor(int a,int b)
	{
		int a1=a;
		int a2=b;
		System.out.println("two parameterized constructor");
		System.out.println("value of a and b is"+a1 +a2 );

	}
	public Constructor(int a, int b, float c)
	{
		int a1=a;
		int a2=b;
		float a3=c;
		System.out.println("three parameterized constructor");
		System.out.println("Value of a, b and c is =" +a1 +a2 +a3);
	}
	
	public static void main(String[] args) 
	{
	
	Constructor ct=new Constructor();
	Constructor ct1=new Constructor(1);
	Constructor ct2=new Constructor(1,2);
	Constructor ct3=new Constructor(1,2,3.14F);	
	}

}
