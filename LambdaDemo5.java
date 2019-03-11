import java.util.HashMap;
import java.util.Map;

public class LambdaDemo5 {

		public static void main(String[] args)
		{
			Map<String,String> books=new HashMap<>();
			books.put("Let Us C", "Yashwant Kanetkar");
			books.put("Object Oriented Programming using Java", "Simon Kendal");
			books.put("Java: Graphical User Interfaces", "David Etheridge");
			
				//Using Lambda Expression
				books.forEach((key,value) -> System.out.println("Book Name:- " + key + ",Author:- " +value));
			
				System.out.println();
				
				//using Lambda Block
				books.forEach((key,value) -> { System.out.println("Book Name:- " +key + "Author:-" + value);});
				
				System.out.println();
		}
}
