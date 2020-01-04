package NOV_2019;
import java.util.Scanner;
//   (((((x1+x2)-x3)+x4)*x5)/x6)
public class Scanner2ndprog 
{
	
	public static void main(String[] args) 
	{
		System.out.println("(((((x1+x2)-x3)+x4)*x5)/x6)");
		System.out.println("Please enter values");
		Scanner s= new Scanner(System.in);
		double x1=s.nextDouble();
		System.out.println("Value of x1 is "+x1);
		double x2=s.nextDouble();
		System.out.println("Value of x2 is "+x2);
		double x3=s.nextDouble();
		System.out.println("Value of x3 is "+x3);
		double x4=s.nextDouble();
		System.out.println("Value of x4 is "+x4);
		double x5=s.nextDouble();
		System.out.println("Value of x5 is "+x5);
		double x6=s.nextDouble();
		System.out.println("Value of x6 is "+x6);
		System.out.println("\n");
		
		double bracket1 = x1+x2;
		System.out.println("bracket 1 result is "+bracket1);
		double bracket2 = bracket1-x3;
		System.out.println("bracket 2 result is "+bracket2);
		double bracket3 = bracket2+x4;
		System.out.println("bracket 3 result is "+bracket3);
		double bracket4 = bracket3*x5;
		System.out.println("bracket 4 result is "+bracket4);
		double bracket5 = bracket4/x6;
		System.out.println("bracket 5 result is "+bracket5);
		
	}

}
