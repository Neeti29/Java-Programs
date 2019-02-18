public class Test3
{
	public void m1(String s)  //String and Object both will accept null value and they are from the same hierachy 
	{
		System.out.println("String arg");
	}
	
	public void m1(Object ob)
	{
		System.out.println("Object arg");
	}
	
	public static void main(String[] args)
	{
		Test3 t=new Test3();
		t.m1(null);  //String arg
	}
}