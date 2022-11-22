package timeattack1114;

interface Fruit {

	public abstract void print();
}

class Grape implements Fruit {

	@Override
	public void print() {
		System.out.println("나는 포도이다.");

	}

}

class Apple implements Fruit {

	@Override
	public void print() {
		System.out.println("나는 사과이다.");
	}

}

class Pear implements Fruit {

	@Override
	public void print() {
		System.out.println("나는 배이다.");
	}

}

public class Fruits {
	public static void main(String[] args) {
		Fruit fAry[] = { new Grape(), new Apple(), new Pear() };
		for (Fruit f : fAry)
			f.print();
	}
}
