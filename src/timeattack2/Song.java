package timeattack2;

class Out{
	
	public static void main(String[] args) {
		Song s1 = new Song("Dancing Queen", "ABBA",1972, "덴마크");
		s1.show();
	}
}

public class Song {

	String title;
	String artist;
	int year;
	String country;
	
	Song() {}
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.println(year + "년 " +country+"국적의 "+artist+"가 부른" +title);
	}
}

