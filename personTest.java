import java.util.Scanner;
class Person
{
	private String name;  //Encapsulation
	private int age;      //Encapsulation
	private String constituency;
	Scanner s;
	
	Person()  //Default Constructor
	{
		System.out.println("Voter Eligiblity App");
		age=0;
		name="";
		constituency="Noida";
		s=new Scanner(System.in);
		
	}
	Person(String n,int a)//Parameterized Constructor
	{
		name=n;
		age=a;
		
	}
	
	Person(String n,int a,String c)//Parameterized Constructor
	{
		name=n;
		age=a;
		constituency=c;
	}
	void input()
	{
		
		System.out.println("Enter Your Name:");
		name=s.next();
		System.out.println("Enter Your age:");
		age=s.nextInt();
	}
	void print()
	{
		System.out.println("Name is:" + name);
		System.out.println("Age is:" + age);
		System.out.println("Constituency is:" + constituency);
		
		
	
	}
	
	void eligibletoVote()
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		
			
		else
		{
			System.out.println("Not Eligible to vote");
		}
			
	}
	
}

class personTest
{
	public static void main(String [] args)
	{
		//Data Abstraction is done by showing age and name for elgible to vote
		
		Person objPerson=new Person();
		Person objPerson1=new Person("Neeti",24);
		Person objPerson1=new Person("Neeti",24,"Delhi");
		
		objPerson.input();
		objPerson.print();
		objPerson.eligibletoVote();
		
		objPerson1.eligibletoVote();
		objPerson1.print();
		
		objPerson2.eligibletoVote();
		objPerson2.print();
	}
}
