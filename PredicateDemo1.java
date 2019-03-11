import java.util.function.Predicate;

public class PredicateDemo1 {

		static Boolean checkAge(int age)
		{
			if(age>17)
				return true;
			
			else 
				return false;
		}
		public static void main(String[] args)
		{
			//Creating Predicate
			
			Predicate<Integer> lesserthan = i -> (i<18);
			
			//Calling Predicate Method
			
			System.out.println(lesserthan.test(10));
			
			//Calling using Static Method
			Predicate<Integer> p =PredicateDemo1::checkAge;
			boolean r=p.test(25);
			System.out.println(r);
		}
}
