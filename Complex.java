class Complex
{
	double real;
	double imaginary;
	
	public Complex(double r,double i)
	{
		this.real=r;
		this.imaginary=i;
	}
	
	void add(Complex obj2)
	{
		this.real+=obj2.real;
		this.imaginary+=obj2.imaginary;
	}
	
	void display()
	{
		System.out.println(this.real +" + i"+ this.imaginary);
	}
	
	public static void main(String[] args)
	{
		Complex obj1=new Complex(10.3,67.4);
		Complex obj2=new Complex(0.7,3.6);
		
		obj1.add(obj2);
		System.out.println("The addition of the Complex numbers is:");
		
		obj1.display();
	}
}
