public class Test4 {
	public void m1(int i,float j)
	{
		System.out.println("Int and Float");
	}
	
	public void m1(float f,int i)
	{
		System.out.println("Float and Int");
	}
	
	public static void main(String [] args)
	{
		Test4 t=new Test4();
		t.m1(10, 10f);
		t.m1(10f, 10);
		t.m1(10, 10);
		t.m1(10f, 10f);
	}
}
