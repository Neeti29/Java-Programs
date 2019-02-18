
public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder str = new StringBuilder("study");
		  str.append( "java programming " );
		  System.out.println(str);
		  str.replace( 6, 13, "today");
		  System.out.println(str);
		  str.reverse();
		  System.out.println(str);
		  str.replace( 6, 13, "today");
		  System.out.println(str.length());
		  System.out.println(str.capacity());
	}

}
