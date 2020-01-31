package NOV_2019;

public class Prg2_MLInheritance_cls2 extends Prg2_MLInheritance_cls1
{
	public float MethodDiv(float a, float b)
	{
		float c= a/b;
		System.out.println("I am child of parent method a/b " +c);
		return c;
	}
	public static void main(String[] args)
	{
		Prg2_MLInheritance_cls2 obj1 = new Prg2_MLInheritance_cls2();
		obj1.MethodAdd(20, 5);
		obj1.MethodSub(30, 3);
		obj1.MethodDiv(100, 50);
		
	}

}
