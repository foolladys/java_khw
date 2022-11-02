package ScannerTest;

public class Grade {

	int math;
	int science;
	int english;
	char score = ' ';
	int avg;

	Grade() {}

	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int average(int math, int science, int english) {
		avg = (math + science + english) / 3;
		return avg;
	}

	public char getGrade(int avg) {

		if (avg >= 90) {
			score = '수';
		} else if (avg >= 80) {
			score = '우';
		} else if (avg >= 70) {
			score = '미';
		} else if (avg >= 60) {
			score = '양';
		} else {
			score = '가';
		}
		return score;

	}

}
