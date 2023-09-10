// 20220803 컴퓨터학과 정여진
public class Movie {
	public String title, director;
	private int score, year;
	
	// 설정자와 접근자 추가
	public String getTitle(){return title;}
	public String getDirector() {return director;}
	public int getScore() {return score;}
	public int getYear() {return year;}
	
	public void setTitle(String t){title = t;}
	public void setDirector(String d) {director = d;}
	public void setScore(int s) {score = s;}
	public void setYear(int y) {year = y;}
	
	public String toString() {
		String rslt;
		rslt = "제목:" + title + "\n평점:" + score + "점" + "\n감독:" + score + "\n개봉년도:" + year + "년";
		return rslt;
	}
}
