package timeattack;

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}

}

class Apple {
	public String toString() {
		return "this is Apple";
	}
}

class Orange {
	public String toString() {
		return "this is an Orange";
	}
}

public class TimeAttackGeneric {

	public static void main(String[] args) {

		Box<Apple> aBox = new Box<Apple>();
		Box<Apple> aaBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();

		aBox = aaBox;

		// 과일을 박스에 담은 것일까?
		aBox.set(new Apple());
		oBox.set(new Orange());

		// 박스에서 과일을 제대로 꺼낼 수 있을까?
		Apple ap = aBox.get();
		Orange og = oBox.get();

		System.out.println(ap);
		System.out.println(og);
	}
}
