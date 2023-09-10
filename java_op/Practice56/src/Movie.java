//컴퓨터학과 20220803 정여진
/*
import java.util.Random;
public class Movie {
   Random rd = new Random();
   
   private String title, director, mid;
   private int score, year;
   
   public void setTitle(String title) {this.title = title;}
   public void setDirector(String director) {this.director = director;}
   public void setScore(int score) {this.score = score;}
   public void setMid(String mid) {this.mid = mid;}
   public void setYear(int year) {this.year = year;}
   
   public String getTitle() {return title;}
   public String getDirector() {return director;}
   public int getScore() {return score;}
   public int getYear() {return year;}
   public String getMid() {return mid;}
   
   public String toString() {
      return "번호: " + mid + "\n제목: " + title + "\n감독: " + director + "\n제작년도: " + year;
   }
   public Movie() {
      this.mid = makeID();
      this.title = "모름";
      this.director = "모름";
      this.year = -1;
      this.score = -1;
   }
   
   private String makeID() {
      return (rd.nextInt(9000) + 1000) + "-" + (rd.nextInt(9000) + 1000);
   }
   
   public static String compareMovies(Movie x, Movie y) {
      boolean resultD = compareDirector(x, y);
      boolean resultY = compareYear(x, y);
      String rslt = "영화" + x.mid + "와 영화" + y.mid + "는 ";
      
      if(resultD == true && resultY == true) {
         rslt += "감독이 같고 제작년도도 같습니다.";
      }
      else if(resultD == true && resultY == false) {
         rslt += "감독이 같고 제작년도가 다릅니다.";
      }
      else if(resultD == false && resultY == true) {
         rslt += "감독이 다르고 제작년도가 같습니다.";
      }
      else {
         rslt += "감독이 다르고 제작년도도 다릅니다.";
      }
      return rslt;
   }
   
   private static boolean compareYear(Movie x, Movie y) {
      if(x.year == y.year) {
         return true;
      }
      else {
         return false;
      }
   }
   private static boolean compareDirector(Movie x, Movie y) {
      if(x.director.equals(y.director) == true) {
         return true;
      }
      else {
         return false;
      }
   }
   
}
*/
import java.util.Random;

public class Movie{
	Random rd = new Random();
	
	private String title;
	private String director;
	private int year, mid;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDirector() {
		return director;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getMid() {
		return mid;
	}
	private String makeID() {
		return (rd.nextInt(9000) + 1000 + "-" + rd.nextInt(9000) + 1000);
	}
}
