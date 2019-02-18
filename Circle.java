public class Circle implements IShape
{
	private double radius;
	
	public Circle(double r)
	{
		this.radius=r;
	}
	
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	
	public double getArea()
	{
		return Math.PI*this.radius*this.radius;  //Math is a class and PI is a function
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
}