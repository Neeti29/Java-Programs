public class ObjectClass
{
	public static void main(String[] args)
	{
		ObjectClass oc=new ObjectClass();
		System.out.println(oc.hashCode());
		System.out.println(oc.toString());
        System.out.println(oc.getClass());
		
		ObjectClass oc1=new ObjectClass();
		System.out.println(oc.equals(oc1));
		System.out.println(oc.hashCode());
		System.out.println(oc.toString());
		
		ObjectClass oc2=oc;
		
		System.out.println(oc.equals(oc2));
		

	}
}