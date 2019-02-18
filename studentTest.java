import java.util.Scanner;

class Student
{
	private String name;  //Encapsulation and Data Abstraction
	private int rollNo;
	private String branch;
    private int marks[]=new int[10];
	private float per;
   
	void input()
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		name=s.nextLine();
		System.out.println("Enter Your Roll No:");
		rollNo=s.nextInt();
		System.out.println("Enter Your Branch:");
		branch=s.next();
		System.out.println("Enter Your Marks:");
		for(int i=1;i<=5;i++)
		{
			
			marks[i]=s.nextInt();
			
			
		}	
	}
	
	void calculateMarks()
	{
		int totalMarks=0;
		for(int i=1;i<=5;i++)
		{
			totalMarks=totalMarks+marks[i];
		}
	    
		per=(float)(totalMarks*100)/500;
		
	}
	
	void display()
	{
		System.out.println("Name is:"+name);
		System.out.println("Roll No is:"+rollNo);
		System.out.println("Branch is:"+branch);
		System.out.println("percentage is:"+per);
		if(per>=50 && per<=65)
			System.out.println("Distinction II");
		
		else if(per>=70)
			System.out.println("Distinction I");
		
		else
			System.out.println("Fail");
	
	}
}

class studentTest
{
	public static void main(String [] args)
	{
		Student objStudent=new Student();
		objStudent.input();
		objStudent.calculateMarks();
		objStudent.display();
	}
}