class OverloadDemo
{
	void add()
	{
		System.out.println("Overloading Methods");
	}
	
	void add(int a,int b)
	{
		System.out.println("The addition is :"+ (a+b));
	}
	
	void add(double a)
	{
		System.out.println("The addition is:" + (a+a));
	}
	
	void add(String a,String b)
	{
		System.out.println("The addition is:" + (a+b));
	}
	
	public static void main(String [] args)
	{
		OverloadDemo demoObj=new OverloadDemo();
		demoObj.add();
		demoObj.add(10,20);
		demoObj.add(10);
		demoObj.add("Hello","Java");
		
		
	}
}	