import oracle.Softwares1;
import sun.Softwares;

public class SoftwareList {

	
	protected SoftwareList()
	{
		
	}
//This is a main method

//It creates objects of classes in sun and oracle packages and access its methods
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Softwares objSun=new Softwares();
	 objSun.listSoftware();
	 Softwares1 objOracle=new Softwares1();
	 objOracle.printSoftware();
		

	}

}
