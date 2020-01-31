package NOV_2019;

public class Prg1_SLInheritance_cls2 extends Prg1_SLInheritance_cls1
{
	// has a relation
	public int sub(int c, int d)
	{
		int e= c-d;
		System.out.println("Sub result is "+c);
		return c;
		
	}
	public static void main(String[] args)
	{
		Prg1_SLInheritance_cls2 obj1= new Prg1_SLInheritance_cls2();
		obj1.add();
		obj1.sub(10, 5);
		
	}

}
