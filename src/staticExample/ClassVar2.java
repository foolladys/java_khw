package staticExample;

public class ClassVar2 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 4;
		Card c2 = new Card();
		c2.kind = "King";
		c2.number = 10;
		System.out.println("1번 카드의 문양은 "+c1.kind+"이며, "+c1.number+"번 카드입니다.");
		System.out.println("2번 카드의 문양은 "+c2.kind+"이며, "+c2.number+"번 카드입니다.");
	}
	
	
}

class Card {
	
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	
}