public interface IShape
{
	//implicitly public,static and final
	
	public String LABLE="Shape";
	
	//Interface methods are implicitly abstract and public
	
	void draw();
	
	double getArea();
}