package NOV_2019;

public class Arithmetic 
{

	public int add(int a, int b)
	{
		int c;
		c= a+b;
		System.out.println("Addition result is "+c);
		return(c);		
	}
	public int subtract(int a,int b)
	{
		int c;
		c= a-b;
		System.out.println("Subtract result is "+c);
		return(c);
	}
	public void multiple(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Multiplication result is "+c);
	}
	public static void main(String[] args)
	{
		Arithmetic calc= new Arithmetic();
		int add_result =calc.add(10, 20);
		int subtract_result = calc.subtract(10, 5);
		calc.multiple(add_result, subtract_result);
		
	}

}
