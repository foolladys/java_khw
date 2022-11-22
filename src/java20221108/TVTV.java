package java20221108;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	
	int color;
	
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	
	void printProperty() {
		System.out.println(super.getSize() + "인치" + color + "컬러");
	}
	
}


public class TVTV {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(64, 1024);
		myTV.printProperty();
	}

}
