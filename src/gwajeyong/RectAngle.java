package gwajeyong;

public class RectAngle {

	int x;
	int y;
	int width;
	int height;
	int area;
	
	RectAngle() {}
	RectAngle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square(int width, int height) {
		
		area = width*height; // 넓이 구하기
		
		return area;
	}
	
	public void show(int x, int y, int width, int height) {

		System.out.println("("+ x +"," +y+")에서 크기가"+width+"*"+height+"인 사각형");
		
	}
	
	// r의 x좌표 r.x~r.x+r.width
	// r의 y좌표 r.y~r.y+r.height
	
	public boolean contains(RectAngle r) {
		if(r.x >= x && (r.x+r.width) <= (x+width) && r.y >= y && (r.y+r.height) <= (y+height) ) {
			/*
			System.out.println("대상의 x좌표 : " + x);
			System.out.println("대상의 y좌표 : " + y);
			System.out.println("대상의 길이 : " + width);
			System.out.println("대상의 높이 : " + height);
			System.out.println("비교대상의 x좌표 : " + r.x);
			System.out.println("비교대상의 y좌표 : " + r.y);
			System.out.println("비교대상의 길이 : " + r.width);
			System.out.println("비교대상의 높이 :" + r.height);
			*/
			return true;
		}
		else {
			/*
			System.out.println("대상의 x좌표 : " + x);
			System.out.println("대상의 y좌표 : " + y);
			System.out.println("대상의 길이 : " + width);
			System.out.println("대상의 높이 : " + height);
			System.out.println("비교대상의 x좌표 : " + r.x);
			System.out.println("비교대상의 y좌표 : " + r.y);
			System.out.println("비교대상의 길이 : " + r.width);
			System.out.println("비교대상의 높이 :" + r.height);
			*/
			return false;
		
		
		}
	}
}
