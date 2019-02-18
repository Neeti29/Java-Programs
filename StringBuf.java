
public class StringBuf {
	//Constructor
	
	protected StringBuf()
    {  }
		public static void main (String[] args)
		{  
			StringBuffer buf = new StringBuffer("Java");
			buf.append(" Guide Verl/"); //append //Java Guide Verl/7
			buf.append(3);
			int index = 5; //Insert //Java Student Guide Verl/7
			buf.insert(index ,  "Student ");
			index=22;  //Set //Java Student Guide Verl.7
			buf.setCharAt(index,  '.');
			int start = 24; //Replace // Java Student Guide Verl.8
			int end = 25;
			buf.replace(start, end, "8");
			String s = buf.toString();  //Convert to String
			System.out.println(s);
			
		}
	}


