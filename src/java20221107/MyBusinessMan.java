package java20221107;

class Man {
	private String name;

	public Man() {
	}

	public Man(String name) {
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

//this 생성
class BusinessMan extends Man {
	String company;
	String position;

	public BusinessMan(String name, String company, String position) {

		// super("홍길동");
		// this.name = name;
		// super.name = name;
		super(name);
		
		this.company = company;
		this.position = position;
	}

	public void tellYourInfo() {
		System.out.println("My company is " + this.company);
		System.out.println("My position is " + this.position);
		tellYourName();
	}
}

class MyBusinessMan {
	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("홍", "Hybrid ELD", "Staff Eng.");

		man.tellYourInfo();

	}
}