package timeattack1108;


class TV {

	public TV() {
	}

	private int size; // TV 사이즈

	public TV(int size) {
		this.size = size;
	} // 생성자

	protected int getSize() {
		return size;
	} // 사이즈 가져오는 함수
}

class ColorTV extends TV {
	int size = super.getSize();
	int color;

	public ColorTV(int size, int color) {
		this.size = size;
		this.color = color;
	}

	public void printProperty() {
		System.out.println(size + "인치 " + color + "컬러");
	}
}

public class TVTest {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}