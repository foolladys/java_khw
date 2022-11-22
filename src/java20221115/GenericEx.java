package java20221115;

class Apple {
	public String toString() {
		return "I'm an apple.";
	}
}
class Orange {
	public String toString() {
		return "I'm an orange.";
	}
}

class Box<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}


public class GenericEx {
	public static void main(String[] args) {
        Box<Apple> aBox = new Box<Apple>();
        Box<Orange> oBox = new Box<Orange>();

        // 과일을 박스에 담은 것일까? 
        aBox.set(new Apple());
        oBox.set(new Orange());

        Apple ap = aBox.get();
        Orange og = oBox.get();

        System.out.println(ap);
        System.out.println(og);
	}
}
