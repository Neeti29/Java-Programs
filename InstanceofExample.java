public class InstanceofExample
{
	public static void main(String[] args)
	{
		Vehicle vehObj=new Vehicle();
		Car carObj=new Car();
		MotorCycle motoObj=new MotorCycle();
		
		//Those will evaluate to true
		System.out.println("vehObj instanceof Vehicle:" +(vehObj instanceof Vehicle));
		System.out.println("carObj instanceof Vehicle: " +(carObj instanceof Vehicle));
		System.out.println("carObj instanceof Car: "+ (carObj instanceof Car));
		System.out.println("carObj instanceof DriverCar:" + (carObj instanceof DriverCar));
		System.out.println("vehObj instanceof Car: " + (vehObj instanceof Car));
		
		System.out.println("motoObj instanceof Vehicle: " + (motoObj instanceof MotorCycle));
		
		
		//Those will evaluate to false,as the object car is null
		carObj=null;
		System.out.println("(carObj=null) instanceof Vehicle: " + (carObj instanceof Vehicle));
		System.out.println("(carObj=null) instanceof Car: " + (carObj instanceof Car));
	}
}

class Vehicle
{
	
}

class Car extends Vehicle implements DriverCar
{
	
}

class MotorCycle extends Vehicle
{ 
 
}

interface DriverCar
{
	
}	