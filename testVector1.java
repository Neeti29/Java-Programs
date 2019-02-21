import java.util.*;
public class testVector1 {
 public static void main(String args[])
 {
	 Vector<String> v=new Vector<String>();   //Creating Vector
	 v.add("umesh"); //method of Collection
	 v.addElement("John");
	 v.addElement("Kumar");

 
 //traversing elements using Enumeration
 Enumeration e=v.elements();
 while(e.hasMoreElements())
 {
	 System.out.println(e.nextElement());
 }
}
}