import java.util.*;
public class TestCollection13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(111,"John");
		hm.put(222,"Jim");
		hm.put(333,"Mike");
		hm.put(353,"Duke");
		hm.put(234, "Neeti");
		hm.put(212,"mohit");
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());

	    }

}
	
}