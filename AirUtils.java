package com.niit.emirates;

public class AirUtils {

		public static String makeItUpper(String name)
		{
			return name.toUpperCase();
		}
		
		public static double callTax(long fare)
		{
			return ((fare)+(fare*.12));
		}
}
