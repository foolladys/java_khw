package timeattack2;

public class Grade {

	int num1, num2, num3 = 0;
	int avg = 0;
	char avg_grade = ' ';
	
	Grade() {
	}

	Grade(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public int avg(int num1, int num2, int num3) {

		avg = (num1 + num2 + num3) / 3;
		return avg;
	}
	
	public char avg_grade(int avg) {
		
		if(avg>=90) {
			avg_grade = '수';
		}
		else if(avg>=80) {
			avg_grade = '우';
		}
		else if(avg>=70) {
			avg_grade = '미';
		}
		else if(avg>=60) {
			avg_grade = '양';
		}
		else if(avg>=50) {
			avg_grade = '가';
		}
		else
			avg_grade = '가';
			
		return avg_grade;
	}

}
