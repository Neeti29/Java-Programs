interface TollBooth2
{
	public void calculateToll(Truck t);
	public void displayData();
}

interface Truck2
{
	public int getAxles();
	public double getWeight();
}

class FordTruck implements Truck2
{
	int axle;
	double weight;
	FordTruck(int a,int w)
	{
		axle=a;
		weight=w;
	}
	public int getAxles()
	{
		return axle;
	}
	
	
	public double getWeight()
	{
		return weight;
	}
}

class AlleghenyTollBooth implements TollBooth2
{
	double toll;
	public void calculateToll(Truck t)
	{
		int axle=t.getAxles();
		double weight=t.getWeight();
		
		toll = 5*axle + 10*((weight/1000)/2);
	
		
		
	}
	
	public void displayData()
	{
		System.out.println(toll);
	}
	
}






public class TestTollBooth1 {
	
	TollBooth2 booth = new AlleghenyTollBooth();
	Truck2 ford = new FordTruck(5,12000); // 5 axles and 12000 kilograms
	
   //   booth.calculateToll(ford);
	//  booth.displayData();



}
