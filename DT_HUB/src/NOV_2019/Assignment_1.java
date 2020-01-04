package NOV_2019;
// (((((10+2)-2)+2)*2)/2
public class Assignment_1 {
	public double add(double a, double b)
	{
		double c;
		c=a+b;
		System.out.println("Addition result is "+c);
		return(c);	
	}	
	public double sub(double a, double b)
	{
		double c;
		c=a-b;
		System.out.println("Subtraction result is "+c);
		return(c);	
	}	
	public double Mul(double a, double b)
	{
		double c;
		c=a*b;
		System.out.println("Multiplication result is "+c);
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
	Assignment_1 calc = new Assignment_1();
	double bracket_1 = calc.add(10, 2);
	double braclet_2 = calc.sub(bracket_1, 2);
	double braclet_3 = calc.add(braclet_2, 2);
	double braclet_4 = calc.Mul(braclet_3, 2);
	calc.div(braclet_4, 2);		
	}
}
