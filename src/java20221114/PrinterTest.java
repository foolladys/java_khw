package java20221114;

interface Printable {
	public abstract void print(String doc);
}

class SPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From Samsung Printer");
		System.out.println(doc);
	}
	
}

class LPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From LG Printer");
		System.out.println(doc);
	}
	
}

public class PrinterTest {

	public static void main(String[] args) {
		
		String doc = "This is a report about";
		Printable prn1 = new SPrinterDriver();
		Printable prn2 = new LPrinterDriver();
		
		prn1.print(doc);
		prn2.print(doc);
	}
}
