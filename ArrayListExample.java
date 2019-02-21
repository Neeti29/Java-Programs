//how to store user defined objects into an ArrayList

import java.util.*;

class Book
{
	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating list of Books
			List <Book> bObj=new ArrayList<Book>();  //List is a interface and ArrayList is a class implementing List Interface
			
		//Creating Books
			Book b1=new Book(101,"Let us C", "Yashwant Kanetkar","BPB",8);
			Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
			Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
			
			//Adding Books to List
			
			bObj.add(b1);
			bObj.add(b2);
			bObj.add(b3);
			
			//Traversing list
			
			for(Book b :bObj)
			{
				System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
				
			}
			
			
	}

}
