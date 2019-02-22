package JDBC;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Writing to a file using BufferedWriter in Java
		
		try
		{
			FileWriter writer=new FileWriter("D:\\names.txt",true);  //Append true and false
			BufferedWriter bwr=new BufferedWriter(writer);  //Improve Reading and Writing fast(Improve performance and Efficiency
			
			bwr.write("James");
			bwr.newLine();//.write('\n');
			bwr.write("Hobert");
			bwr.close();
			
			System.out.println("Successfully written to a file");
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

}
