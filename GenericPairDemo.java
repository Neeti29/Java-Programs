import java.util.Scanner;
public class GenericPairDemo 
{
	public static void main(String[] args)
	{
		Pair<String> secretPair=new Pair<String>("Happy" , "Day");
		
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Enter two words:");
		String word1=Keyboard.next();
		String word2=Keyboard.next();
		Pair<String> inputPair=new Pair<String>(word1,word2);
		
		Pair<Integer> secretPair1=new Pair<Integer>(10, 20);
		secretPair1.display();
		
		if(inputPair.equals(secretPair))
		{
			System.out.println("You guessed the secret words");
			System.out.println("in the correct order!");
		}
		
		else
		{
			System.out.println("You guessed incorrectly");
			System.out.println("You guessed");
			System.out.println(inputPair);  //toString method will be called
			System.out.println("The secret words are");
			System.out.println(secretPair);
		}
	}
}
