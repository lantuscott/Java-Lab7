
public class DeckOfCards
{
	public int[] buildDeck(int[] deck)
	{
		deck = null;
		return deck;
	}
	
	public void shuffle(int[] deck)
	{
	// notice how assigning to deck[i] affects actual param contents!
		
	}
	
	public String getSuit (int card)
	{
		return "?";
	}
	
	public String getRank (int card)
	{
		return "?";
	}
	
	public static void main(String[] args)
	{
		int[] deck = new int[52];
		
		String[] suits =
		{ "Spades", "Hearts", "Clubs", "Diamonds" };
		
		String[] ranks =
		{ "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		// Initialize cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;

		// Shuffle the cards
		for (int i = 0; i < deck.length; i++)
		{
			// Generate an index randomly (sez Liang) but...
			// ALERT! This is NOT a truly-random shuffle.
			//	Details in class...
			
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}

		// Display the first four cards
		for (int i = 0; i < 4; i++)
		{
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}
}
