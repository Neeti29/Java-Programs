
public class RuntimeDemo {

	protected RuntimeDemo()
	{
		
	}
	//It demonstartes use of runtime method and execution of Calculator program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime objRun=Runtime.getRuntime();
		Process objProcess=null;
		
		try
		{
			objProcess=objRun.exec("calc.exe");
			System.out.println(objRun.freeMemory());
			System.out.println(System.getProperty("java.class.path"));
			System.out.println(System.getProperty("java.home"));
			System.out.println(System.getProperty("java.class.version"));
			System.out.println(System.getProperty("java.specification.vendor"));
			System.out.println(System.getProperty("java.specification.version"));
			System.out.println(System.getProperty("java.vendor"));
			System.out.println(System.getProperty("java.vendor.url"));
			System.out.println(System.getProperty("java.version"));
			System.out.println(System.getProperty("java.vm.name"));
			//objRun.gc();
			
						
		}
		
		catch(Exception e)
		{
			System.out.println("Error executing Calculator");
		}
		
	}

}
