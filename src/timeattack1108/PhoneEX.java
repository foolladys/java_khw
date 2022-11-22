package timeattack1108;

class MobilePhone {
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi~ from "+number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidver;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidver = ver;
	}
	
	public void playApp() {
		System.out.println("App is running in "+androidver);
	}
}
public class PhoneEX {
	
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-555-777", "Nougat");
		phone.answer();
		phone.playApp();
	}

}
