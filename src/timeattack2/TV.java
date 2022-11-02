package timeattack2;

public class TV {

	String brand;
	int year;
	int inch;
	
	TV(){}
	TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(brand + "브랜드에서 만든"+ year + "년형 " + inch + "인치 TV입니다.");
	}
	
}
