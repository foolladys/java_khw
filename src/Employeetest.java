class Employee {
	String name;
	int age;
	String addr;
	String dept;
	int salary;


	public Employee(String name, int age, String addr, String dept) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.dept = dept;
	}

	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("부서 : " + dept);
	}
}

class Regular extends Employee {

	public Regular(String name, int age, String addr, String dept) {
		super(name,age,addr,dept);
	}
	
	public void setSalary(int salary) {
		super.salary = salary;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("부서 : " + dept);
		System.out.println("정규직");
		System.out.println("월급: " + salary);
	}

}
class Temporary extends Employee {
	
	int workHour;
	int timePay;
	
	public Temporary(String name, int age, String addr, String dept) {
		super(name, age, addr, dept);
		timePay = 10000;
	}
	
	public void setWorkHour(int workHour) {
		this.salary = workHour*timePay;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("부서 : " + dept);
		System.out.println("비정규직");
		System.out.println("월급 : " + salary);
	}
	
}


public class Employeetest {
	public static void main(String[] args) {

		Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
		employee.printInfo();

		Regular kang = new Regular("강준일", 24, "마계 인천", "개발 1팀");
		kang.setSalary(10000);
		kang.printInfo();
		
		Temporary T_kang = new Temporary("강준일2", 24, "마계 인천","개발 1팀");
		T_kang.setWorkHour(1000);
		T_kang.printInfo();
	}
}