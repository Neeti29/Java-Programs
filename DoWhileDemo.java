import java.util.Scanner;
	
class DoWhileDemo
{

    public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		String guess;
		
		do
		{
			System.out.print("Guess my name:");
			guess=s.nextLine();
		}
		while(!"Neeti".equals(guess));
		System.out.println("Congratulations you guessed my name correctly");
	}
}