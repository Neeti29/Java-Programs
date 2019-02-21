
public class GenericMethodTest 
{
	//generic method printArray
	
	public static <E> void printArray(E[] inputArray)  //printArray is printing generic arrays
	{
		//Display array elements
		
		for(E element : inputArray)  //for each loop (E is the type of array which is generic that accepts Integer,Double and Character)
		{
			System.out.printf("%s ", element);
		}
		
		System.out.println();
	}
	
	
	public static void main(String args[])
	{
		//Create arrays of Integer , Double and Character
		
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4};
		Character[] charArray = {'H','E','L','L','O'};
		
		System.out.println("Array integerArray contains:");
		printArray(intArray); //pass an Integer array
		
		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray); //pass a Double array
		
		System.out.println("\nArray characaterArray contains:");
		printArray(charArray); //pass an Character array
		
		
	}

}
