package timeattack;

public class TV {

	String brand;
	int year;
	int inch;
	
	TV() {}
	TV(String brand, int year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(brand+"에서 만든"+year+" 년 형 "+inch+"인치 TV");
	}
	
}
