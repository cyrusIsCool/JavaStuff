import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

static Random rand = new Random();	

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//BUILD CARDS
		Card FireElement = new Card("Fire Element", 0, 0, 0, "Activate this card to generate one fire resource.", 001);
		Card Goblin = new Card("Goblin", 2, 2, 1, "", 002);
		Card Orc = new Card("Orc", 3, 3, 2, "", 003);
		

//LOAD A FILE FROM DECK BUILDER		
		ArrayList<Card> PreDeck = new ArrayList<Card>();
		PreDeck.add(FireElement);		PreDeck.add(FireElement);		PreDeck.add(FireElement);
		PreDeck.add(Goblin);		PreDeck.add(Goblin);	
		PreDeck.add(Orc);		PreDeck.add(Orc);		

		
		
//DECK
		ArrayList<Card> Shuffler = new ArrayList<Card>();
		ArrayList<Card> Deck = new ArrayList<Card>();
		
		
		for(int i = 0; i<PreDeck.size(); i++) {
			Deck.add(PreDeck.get(i));
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Your deck has " + Deck.size() + " cards in it.");
		System.out.println("-----------------------------------------------");
		
//SHUFFLER
		Collections.shuffle(Deck);
		
		System.out.println("The top card of the deck is " + Deck.get(0) + ".");
		System.out.println("-----------------------------------------------");
		
		//Hand Zone
		ArrayList<Card> Hand = new ArrayList<Card>();
		
		System.out.println("# Press D to draw a card.\n");
		
boolean drawing = true;

		while(drawing){
		String input = in.nextLine();
		while(!input.equals("D") && !input.equals("d") && !input.equals("s")){
			System.out.println("Invalid input.");
			input = in.nextLine();
	}
		
		if(input.equals("D") || input.equals("d")) {
			Hand.add(Deck.get(0));
			Deck.remove(0);

			System.out.println("You drew " + Hand.get(Hand.size() - 1) + ".");
		}
		else if(input.equals("s")){
			System.out.println("Your hand:\n");
			for (int i=1; i < Hand.size(); i++){
				System.out.println("# " + Hand.get(i) + "\n");
			}
		}
		}
	}
}

		
		
		//In Play Zone
		
		//Discard Zone
		
	

		


