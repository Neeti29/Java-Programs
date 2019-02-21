import java.util.*;
class Student1{

		public int rollNo;
		public String name,address;
		
		//Constructor
		
		public Student1(int rollno,String name,String address)
		{
			this.rollNo=rollno;
			this.name=name;
			this.address=address;
		}
		
		//used to print Student details in main()
		
		public String toString()
		{
			return this.rollNo+ " " + this.name+ " " + this.address;
		}

}

class Sortbyroll implements Comparator<Student1>
{
	//Used for sorting in ascending order of roll number
	
	public int compare(Student1 a,Student1 b)
	{
		return a.rollNo - b.rollNo;
	}
}

class Sortbyname implements Comparator<Student1>
{
	//used for sorting in ascending order of rollno and name
	
	public int compare(Student1 a,Student1 b)
	{
		return a.name.compareTo(b.name);
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1=new Date();
		System.out.println(d1.toString());
		ArrayList<Student1> ar=new ArrayList<Student1>();
		ar.add(new Student1(111,"bbbb","london"));
		ar.add(new Student1(131,"aaaa","nyc"));
		ar.add(new Student1(121,"cccc","jaipur"));
		
		System.out.println("Unsorted");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
			
			Collections.sort(ar,  new Sortbyroll());
		}	
			
		System.out.println("\nSorted by rollno");
		
		for(int i=0;i<ar.size();i++)
		{
				System.out.println(ar.get(i));
		
		}
		
		Collections.sort(ar,  new Sortbyname());
		
		System.out.println("\nSorted by name");
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
			
	}

		
		

	}