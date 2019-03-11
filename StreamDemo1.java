import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class StreamDemo1 {

		public static void main(String[] args)
		{
			List<String> names=new ArrayList<>();
			names.add("Amit");
			names.add("Shekar");
			names.add("Aman");
			names.add("Nikita");
			names.add("Niharika");
			names.add("Kanika");
			names.add("Mohit");
			names.add("Rajitha");
			
			//core Intermediate Stream operations
			
			//filter
			System.out.println("Names starts with A");
			names.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase)
			
			.forEach(System.out::println);
			
			//sorted
			
			System.out.println("Sorted Names are:");
			names.stream().sorted().map(String::toUpperCase)
			.forEach(System.out::println);
			
			//Terminal operations
			//foreach
			
			names.forEach(System.out::println);
			
			//collect
			
			System.out.println("Sorted Names");
			List<String> namesUpperCase=names.stream().sorted()
			.map(String::toUpperCase).collect(Collectors.toList());
			
			System.out.println(namesUpperCase);
			
			//count
			System.out.println("Count");
			long tm=names.stream().filter((s) -> s.startsWith("A")).count();
			System.out.println("Total names starts with A: "+tm);
			
			//reduce(Optional is a class in java 8)
			System.out.println("Reducing Elements");
			Optional<String> r=names.stream().reduce((s1,s2) -> s1 + "#" + s2);
			r.ifPresent(System.out::println);
			
			
		}
}
