package NOV_2019;

public class Assignment1Constructor 
{
	public Assignment1Constructor()
	{
		this(11,22,33);
		System.out.println("Default constructor");
	}
	
	public Assignment1Constructor(int a)
	{
		this();
		System.out.println("One parameterized constructor");
	}
	public Assignment1Constructor(int a, int b)
	{
		this(11,22,33,44);
		System.out.println("two parameterized constructor");

	}

	public Assignment1Constructor(int a, int b, int c)
	{
		
		System.out.println("three parameterized constructor");

	}
	public Assignment1Constructor(int a, int b, int c, int d)
	{
		this(11);
		System.out.println("Four parameterized constructor");

	}
	public static void main(String[] args) {
		Assignment1Constructor c1= new Assignment1Constructor(11,22);

	}

}
