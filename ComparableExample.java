import java.util.*;
class Student implements Comparable <Student>
{
	int rollNo;
	String name;
	int age;
	
	Student(int rollNo,String name,int age)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}
	
	public int compareTo(Student st)
	{
		if(age==st.age)
			return 0;
		
	/*	else if(age>st.age)  //Ascending Order
			return 1;*/
		
		else if(age<st.age)  //Descending Order
			return 1;
		
		else
			return -1;
	}
}
public class ComparableExample       //Sort the Objects using Comparable Class
{
	public static void main(String[] args)
	{
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student(111,"John",29));
		a1.add(new Student (222,"Mike",21));
		a1.add(new Student(555,"Mary",26));
		
		Collections.sort(a1);
		for(Student st:a1)
		{
			
			System.out.println(st.rollNo+ " "+st.name+" "+st.age);
		}
		
	}
	
}
