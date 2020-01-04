package NOV_2019;

public class Assignment2Method 
{
	public void method1()
	{
		this.method4(11, 22, 33);
		System.out.println("default method");
	}
	
	public void method2(int a)
	{
		this.method1();
		
		System.out.println("one Parameterized method");
	}
	
	public void method3(int a, int b)
	{
		this.method5(11, 22, 33, 44);
		System.out.println("two Parameterized method");
	}
	
	public void method4(int a, int b, int c)
	{
		
		System.out.println("three Parameterized method");
	}
	
	public void method5(int a, int b, int c, int d)
	{
		this.method2(11);
		System.out.println("Four Parameterized method");
	}
	
public static void main(String[] args) 
{
	Assignment2Method a1= new Assignment2Method();
	a1.method3(11, 22);
}
}
