public class Test2
{
	public void m1(String s) //because string and stringbuffer accept null value
	{
		System.out.println("String arg");
	}
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer arg");
	}
	
	public static void main(String[] str)
	{
		
		Test2 t=new Test2();
		t.m1(null);
	}
}	