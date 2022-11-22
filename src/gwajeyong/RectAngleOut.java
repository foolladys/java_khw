package gwajeyong;

public class RectAngleOut {

	public static void main(String[] args) {
		
		RectAngle r = new RectAngle(2, 2, 8, 7);
		// 사각형 r
		RectAngle s = new RectAngle(5, 5, 6, 6);
		// 사각형 s
		RectAngle t = new RectAngle(1, 1, 10, 10);
		// 사각형 t
		r.show(r.x, r.y, r.width, r.height);
		System.out.println("s의 면적은 = "+(s.square(s.width, s.height)));
	
		if(t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if(t.contains(s))
			System.out.println("t는 s를 포함합니다.");
	}
}
