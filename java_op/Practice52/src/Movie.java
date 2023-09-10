// 20220803 컴퓨터학과 정여진
import java.util.Random;

public class Movie {
	Random rd = new Random();
	
	private String mid;
	private String title;
	private String director;
	private int year;
	private int score;
	
	public String getMid() {return mid;}
	public String getTitle() {return title;}
	public String getDirector() {return director;}
	public int getYear() {return year;}
	public int getScore() {return score;}
	
	public void setMid(String mid) {this.mid = mid;}
	public void setTitle(String title) {this.title = title;}
	public void setDirector(String director) {this.director = director;}
	public void setScore(int score) {this.score = score;}
	public void setYear(int year) {this.year = year;}
	public Movie() {
		this.mid = makeID();
		this.title = "모름";
		this.director = "모름";
		this.year = -1;
		this.score = -1;
	}
	
	private String makeID() {
		String ID;
		int r1 = rd.nextInt(9000) + 1000;
		int r2 = rd.nextInt(9000) + 1000;
		ID = r1 + " - " + r2;
		return ID;
	}
	public 	String toString()
	{
		String rslt;
		rslt = "번호: " + mid + "\n제목:" + title + "\n감독:" + director + "\n제작년도"  + year + "년\n평점:" + score + "점\n";
		return rslt;
	}
}

