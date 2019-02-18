class Arraycopy
{
	public static void main(String [] args)
	{
		int a[]={1,2,3};
		int b[]=new int[a.length];   //creating b array of same size as a
		
		b=a; //Doesn't copy the elements of a[] to b[],only makes b refer to same location
		
		b[0]++; // change to b[] will also reflect in a[] as 'a' and 'b' refer to same location
		
		System.out.println("Contents of a[]");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+ " ");
		}
		
		System.out.println("Contents of b[]");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
		
	}
}