package timeattack1103;

public class Grade {

	int math;
	int science;
	int english;
	int average;
	char avg_Grade = ' ';

	Grade() {
	}

	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int average(int math, int science, int english) {

		average = (math + science + english) / 3;
		return average;

	}

	public char getGrade(int average) {
		if (average >= 90) {
			avg_Grade = '수';
		} else if (average >= 80) {
			avg_Grade = '우';
		} else if (average >= 70) {
			avg_Grade = '미';
		} else if (average >= 60) {
			avg_Grade = '양';
		} else
			avg_Grade = '가';

		return avg_Grade;

	}

}
