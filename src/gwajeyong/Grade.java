package gwajeyong;

public class Grade {

	public static void main(String[] args) {
	
		GradeOut me = new GradeOut(90, 70, 100);
		System.out.println("평균은" + me.average());
		
	}
}

class GradeOut{
	
	int score1, score2, score3;
	double average;
	
	GradeOut(int score1, int score2, int score3){
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	
	public double average() {
		average = (score1 + score2 + score3)/3;
		return average;
	}
	
}