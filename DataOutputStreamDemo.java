package JDBC;
import java.io.*;
public class DataOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   
		 //Writing the data to file using DataOutputStream
		try
		
			(DataOutputStream dout =  new DataOutputStream(new FileOutputStream("D:\\file2.dat")))  //performing task within try block
		{
			
			dout.writeDouble(1.1);
			dout.writeInt(55);
			dout.writeBoolean(true);
			dout.writeChar('4');
			
			System.out.println("Data Written Successfully");
		}
		
		catch(FileNotFoundException ex)
		{
			System.out.println("Cannot open the Output File");
			return;
		}
		
		//Reading the data back using DataInputStream
		
		try
		
			(DataInputStream din = new DataInputStream(new FileInputStream("D:\\file2.dat")))
		{
			double a = din.readDouble();
			int b=din.readInt();
			boolean c =din.readBoolean();
			char d = din.readChar();
			System.out.println("Values: " + a + " " + b + " " + c+ " " + d);
		}
		
		catch(FileNotFoundException ex)
		{
			System.out.println("Cannot open the Input File");
			return;
		}
				
	}

}
