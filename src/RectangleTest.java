
public class RectangleTest {
	public static void main(String[] args) {

		Rectangle rec = new Rectangle(10, 20);

		System.out.println(rec.getArea(10, 20));

	}
}

class Rectangle {
	
	int width, height;

	Rectangle(int width, int height){
		width = this.width;
		height = this.height;
	}

	int getArea(int height, int width) {

		return height * width;
	}
}