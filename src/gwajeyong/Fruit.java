package gwajeyong;

interface Fruits {
	public abstract void print();
}

class Grape implements Fruits {
	public void print() {
		System.out.println("나는 포도다");
	}
}

class Apple implements Fruits {
	public void print() {
		System.out.println("나는 사과다");
	}
}

class Pear implements Fruits {
	public void print() {
		System.out.println("나는 배다");
	}
}

public class Fruit {

	public static void main(String[] args) {
		Fruits fAry[] = { new Grape(), new Apple(), new Pear() };
		for (Fruits fruits : fAry) {
			fruits.print();
		}
	}
}
