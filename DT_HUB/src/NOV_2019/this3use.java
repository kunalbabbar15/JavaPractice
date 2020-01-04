package NOV_2019;

/*public class this3use 
{
	int a;
	
	public void method(int a)
	{
		a=a;
	}
	public static void main(String[] args) 
	{
		this3use d = new this3use();
		d.method(34);
		System.out.println("value of a is "+d.a);
	}

}
*/

/*public class this3use // here value of a = 34 is override by value of a = 123 which is 
// which is global variable. Because control is not going into method 
 * here it is not able to differentiate between local and global variable
 *  if name of local and global variables are same
{
	int a=123;
	
	public void method(int a)
	{
		a=a;
	}
	public static void main(String[] args) 
	{
		this3use d = new this3use();
		d.method(34);
		System.out.println("value of a is "+d.a);
	}

}*/

/*public class this3use // use of this keyword
{
	int a=123;
	
	public void method(int a)
	{
		this.a=a;
		a=a;
	}
	public static void main(String[] args) 
	{
		this3use d = new this3use();
		d.method(34);
		System.out.println("value of a is "+d.a);
	}

}*/

public class this3use // if name of local and global variables are different
{
	int a=123;
	
	public void method(int b)
	{
		a=b;
	}
	public static void main(String[] args) 
	{
		this3use d = new this3use();
		d.method(34);
		System.out.println("value of a is "+d.a);
	}

}



