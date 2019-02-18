class arrayDuplicateElements
{
	public static void main(String [] args)
	{
		int arr[]={2,3,4,5,3,6,7,6,8,9,10};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					count+=1;
				}
				
			}
			if(count==1)
				System.out.println(arr[i]);
			count=0;
		}
		
	}
}


interface TollBooth
{
	
	public void calculateToll(Truck t);
	public void displayData();
}

interface Truck
{

	public void getAxels();
	public void getWeight();

		
}


class AlleghenyTollBooth implements TollBooth
{

	double toll;
	AlleghenyTollBooth(){}
	
	public void calculateToll(Truck t)
	{
		this.toll=(5) *( this.axels) +10 * (this.weight/2);
		System.out.println(this.toll);
	}
	
	public void displayData()
	{
		System.out.println("Ford Truck Toll is: "+toll);
		//System.out.println("Nissan Truck Toll is: "+toll);
	}
		
}

class FordTruck implements Truck
{
	
	
	FordTruck(int a,int w)
	{
		axels=a;
		weight=w;
		
	}
	
	public void getAsxels()
	{
		
	}
}

/*class NissanTruck implements Truck
{
	NissanTruck(){}
	int axels,weight;
	NissanTruck(int a,int w)
	{
		axels=a;
		weight=w;
	}
	
	public void displayData()
	{
		System.out.println("Nissan Truck Number of Axels: "+axels);
		System.out.println("Weight of a Nissan truck: "+weight);
	}
}

class DaewooTruck implements Truck
{
	DaewooTruck(){}
	int axels,weight;
	DaewooTruck(int a,int w)
	{
		axels=a;
		weight=w;
	}
	
	public void displayData()
	{
		System.out.println("Daewoo Truck Number of Axels: "+axels);
		System.out.println("Weight of a Daewoo truck: "+weight);
	}
	
}*/

public class TestTollBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBooth booth = new AlleghenyTollBooth();

		Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms
		//Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg
		//Truck daewoo = new DaewooTruck(6, 17000); // ….
		
		
		booth.calculateToll(ford);
		booth.displayData();
		
		
		//booth.calculateToll(nissan);
		
		//ford.displayData();
		//nissan.displayData();
		//daewoo.displayData();


	}

}
