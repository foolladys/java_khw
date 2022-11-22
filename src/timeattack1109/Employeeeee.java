package timeattack1109;

class Employee {
	String name;
	int age;
	String dept;
	String addr;
	int salary;

	Employee(String name, int age, String dept, String addr) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.addr = addr;
	}

	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("부서 : " + dept);
		System.out.println("주소 : " + addr);
	}

}

class Regular extends Employee {
	Regular(String name, int age, String dept, String addr) {
		super(name, age, dept, addr);
	}

	public void setSalary(int salary) {
		super.salary = salary;
	}

	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("부서 : " + dept);
		System.out.println("주소 : " + addr);
		System.out.println("정규직입니다.");
		System.out.println("월급은 " + salary + "원 입니다.");
	}

}

class Temporary extends Employee {
	
	int workTime;
	final int tempsalary = 10000;
	
	Temporary(String name, int age, String dept, String addr) {
		super(name, age, dept, addr);
	}
	
	public void setSalary(int workTime) {
		super.salary = tempsalary*workTime;
	}
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("부서 : " + dept);
		System.out.println("주소 : " + addr);
		System.out.println("정규직입니다.");
		System.out.println("월급은 " + salary + "원 입니다.");
	}
	
	
}

public class Employeeeee {

	public static void main(String[] args) {

		Employee p1 = new Employee("강준일", 24, "컴공", "마계 인천");
		Regular p2 = new Regular("강준일2", 24, "컴공", "마계 인천");
		Temporary p3 = new Temporary("강준일3", 24, "컴공", "마계 인천");
		
		p1.printInfo();
		System.out.println();
		p2.setSalary(10000);
		p2.printInfo();
		System.out.println();
		p3.setSalary(10);
		p3.printInfo();
		
	}
}
