package java20221110;



interface Printable {

	public final double PI = 3.14; // 생략해도 public final로 선언됨(상수로 사용됨)

	public abstract void print(String doc);
	// abstract : 추상
	// private 안됨
	
	default void printCMYK(String doc) {
		System.out.println("프린트");
	} // 구현 해도 되고 안해도 되고
}
/* 삼성 제조사 */

class SprinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From Samsung Printer");
		System.out.println(doc);
		
		printCMYK("프린트");
	}	
	@Override
	public void printCMYK(String doc) {
		System.out.println("함수 오버라이딩 적용됨.");
	}
	
}

class LPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}

class Printer implements Printable {
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}

class Prn909Drv implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("블랙 지원");
	}
	
	@Override
	public void printCMYK(String doc) {
		System.out.println("칼라 프린트 지원");
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print("강준일");

		Printable printable = new Printer();
		printable.print("강준일2");

		String myDoc = "This is a report about...";
		
		Printable prn = new SprinterDriver();
		prn.print(myDoc);
		System.out.println();

		prn = new LPrinterDriver();
		prn.print(myDoc);
		
		String str2 = "내가 제일 잘나가";
		Printable pr1 = new Prn909Drv();
		pr1.printCMYK(str2);
	}

}


