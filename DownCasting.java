public class DownCasting
{
	//Downcasting is used when you want to perform some specific operation in a generalised method depending upon subtype of Object

		public static void main(String[] args)
		{
			//Upcasting
			Game game2=new Chess();
			
			//Error
			//Chess chess=(Chess) game2;
			
			//Solution:
			
			if(game2 instanceof Cricket)
			{
				Cricket cricket=(Cricket) game2;
				game2.play();
				game2.noOfPlayers();
				game2.winner("B");
			}
			
			else if(game2 instanceof Chess)
			{
				Chess chess=(Chess) game2;
				game2.play();
				game2.noOfPlayers();
				game2.winner("B");
			}
		}
}