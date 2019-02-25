package JDBC;
import java.io.*;
public class DeserializeDemo {

	public static void main(String[] args) throws ClassNotFoundException  {
		// TODO Auto-generated method stub
		
		Employee1 e =null;
		
		try
		{
			FileInputStream fileIn = new FileInputStream("D:\\Temp\\employee.ser");
			ObjectInputStream in =new ObjectInputStream(fileIn);
			e = (Employee1) in.readObject();
			//System.out.println(e);
			in.close();
			fileIn.close();
			
			
		}
		
		catch(IOException i)
		{
			i.printStackTrace();
			return;
		}
		
		catch(ClassNotFoundException c)
		{
			System.out.println("employee class not found");
			return;
		}
		
		System.out.println("Deserialized Employee...");
		System.out.println("Name: "+ e.name);
		System.out.println("Address: " + e.address);
		System.out.println("SSN: " + e.SSN);
		System.out.println("Number: "+ e.number);

	}

}
