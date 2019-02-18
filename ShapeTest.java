public class ShapeTest
{
	public static void main(String []  args)
	{	
		//programming for interfaces not implementation
		
		IShape shapeObj=new Circle(10);
		shapeObj.draw();
		System.out.println("Area="+shapeObj.getArea());
		
		//Switching from one implementation to another easily
		shapeObj=new Rectangle(10,10);
		shapeObj.draw();
		System.out.println("Area="+shapeObj.getArea());
	}
}