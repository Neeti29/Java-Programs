package JDBC;
import java.io.BufferedReader;
import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.FileReader;
import java.io.File;

public class BufferedReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			BufferedReader br=new BufferedReader(new FileReader(new File("D:\\Temp\\countries.txt")));
			String line="";
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			
			br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not exists or insufficient rights");
			e.printStackTrace();
		}
	
		catch(IOException e)
		{
			System.out.println("An exception occured while reading the file");
			e.printStackTrace();
		}
		
		
		
	}
	

}
