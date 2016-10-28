
public class Dice
{
	public static final int NUM_ROLLS = 10; 
	
	public static int rollDie()
	{
		// return random int in range 1..6
		return 1 + (int) (Math.random() * 6);
	}
	
	public static int rollDice()
	{
		// return sum of two die rolls
		return 7;
	}
	
	public static void main(String[] args)
	{
		int[] rolls = new int[13];
		
		for (int i : rolls) // foreach loop
		{
			StdOut.printf("%d ", i);
		}
		StdOut.println();
		
		for (int i=0; i < NUM_ROLLS; i++)
			StdOut.println(rollDie());
	}

}
