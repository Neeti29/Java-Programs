package JDBC;
import java.io.*;
public class BufferedOutputStreamExample {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub

		try
		{
			FileOutputStream fout =new FileOutputStream("D:\\f1.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="Sachin is my favourite player";
			byte b[] = s.getBytes();
			bout.write(b);
			
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("Successfull");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
