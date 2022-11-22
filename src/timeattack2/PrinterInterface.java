package timeattack2;

interface Printable {
	public void print(String Doc);
}

class SPrinter implements Printable {

	@Override
	public void print(String Doc) {
		System.out.println("From Samsung Printer");
		System.out.println(Doc);
	}
}

class LPrinter implements Printable {

	@Override
	public void print(String Doc) {
		System.out.println("From LG Printer");
		System.out.println(Doc);
	}
	
}

public class PrinterInterface {

	public static void main(String[] args) {
		
		String myDoc = "This is a report about...";
		Printable prn = new SPrinter();
		prn.print(myDoc);
		
		System.out.println();
		
		Printable prn2 = new LPrinter();
		prn2.print(myDoc);
		
	}
	
}
