
public class ArrayElements {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {2,3,5,6,10,15,23,21};
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Largest Element"+max);
		System.out.println("Smalles Element"+min);

	}

}
