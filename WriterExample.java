package JDBC;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Writer w=new FileWriter("D:\\data.txt");
			String  content="She Sells Sea Shells In the Sea";
			w.write(content);
			w.close();
			System.out.println("Data Written");
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
