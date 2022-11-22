package timeattack1114;

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	
	void buy(Product p) {
		
	}
}

class Product {
	int price;
	Product(int price){
		this.price = price;
	}
}
class TV extends Product {
	TV() { super(100); }
	
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
}

public class HWnum4 {

	
	
}
