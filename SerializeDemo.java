package JDBC;
import java.io.*;
public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e=new Employee1();
		
		e.name="Micheal Khan";
		e.address="Castle Street , Bangalore";
		e.SSN = 11122333;
		e.number=101;
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream("D:\\Temp\\employee1.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in D:\\Temp\\employee1.txt");
		}
		
		catch(IOException i )
		{
			i.printStackTrace();
		}

	}

}
