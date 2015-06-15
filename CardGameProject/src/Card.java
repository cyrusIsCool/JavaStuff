
public class Card {

@Override
public String toString() {
	return(name);
}
	public String name;
	public int str;
	public int hp;
	public int cost;
	public String text;
	public int num;
	
	public Card(String nameIn, int strIn, int hpIn, int costIn, String textIn, int numIn) {
		name = nameIn;
		str = strIn;
		hp = hpIn;
		cost = costIn;
		text = textIn;
		num = numIn;
	}
	
}
