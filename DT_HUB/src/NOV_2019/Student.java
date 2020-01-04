package NOV_2019;

public class Student 
{
	int age;
	int roll_number;
	
	public void display1()
	{
		System.out.println("Assignmemt 1");
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Selenium is a good tool");
	}
	
	public static void main(String[] args)
	{
		Student s= new Student();
		s.display1();
		s.display2();
		s.age=28;
		s.roll_number=45;
		System.out.println("Age is :"+s.age);
		System.out.println("Roll number is :"+s.roll_number);

	}

}
