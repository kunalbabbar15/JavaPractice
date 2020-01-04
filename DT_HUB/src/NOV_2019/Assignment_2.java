package NOV_2019;
//(((((10*2)-2)-2)+2)/2
public class Assignment_2 
{
	public double mul(double a, double b)
	{
		double c;
		c=a*b;
		System.out.println("Multiplication result is "+c);
		return(c);	
	}
	
	public double sub(double a, double b)
	{
		double c;
		c=a-b;
		System.out.println("Subtraction result is "+c);
		return(c);	
	}
	
	public double add(double a, double b)
	{
		double c;
		c=a+b;
		System.out.println("Addition result is "+c);
		return(c);	
	}
	public double div(double a, double b)
	{
		double c;
		c=a/b;
		System.out.println("Division result is "+c);
		return(c);	
	}

	public static void main(String[] args) 
	{
		Assignment_2 calc = new Assignment_2();
		 double b1 = calc.mul(10, 2);
		 double b2 = calc.sub(b1, 2);
		 double b3 = calc.sub(b2, 2);
		 double b4 = calc.add(b3, 2);
		 calc.div(b4, 2);
	}

}
