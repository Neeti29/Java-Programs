package JDBC;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.omg.CORBA_2_3.portable.OutputStream;
public class InputStreamToFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			InputStream is=new FileInputStream("D:\\Temp\\source.txt");
			
			FileOutputStream os= new FileOutputStream("D:\\Temp\\new_source.txt");
			
			byte[] buffer=new byte[1024];
			
			int bytesRead;
			//read from is to buffer
			
			while((bytesRead=is.read(buffer))!=-1)
			{
				os.write(buffer,0,bytesRead); 
			
			}
			
			System.out.println("File Copied");
			is.close();
			
			//flush OutputStream to write any buffered data to file
			
			os.flush();
			os.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
