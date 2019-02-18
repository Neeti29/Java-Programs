public class Test1
{
	public void m1(int i)
	{
		System.out.println("int arg");
	}
	
	public void m1(float f)
	{
		System.out.println("float arg");
	}
	
	public static void main(String[] args)
	{
		Test1 t= new Test1();
		t.m1(10);
		t.m1(10.5f);
		t.m1('a');
		t.m1(10l);
		t.m1(10.5);
	}
}