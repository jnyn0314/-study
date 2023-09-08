// 20220803 컴퓨터학과 정여진
public class Movie {
	private String title;
	private String director;
	private Date viewDay;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setViewDay(Date viewDay) {
		this.viewDay = viewDay;
	}
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public Date getViewDay() {
		return viewDay;
	}
		
	public Movie() {
		title = "모름";
		director = "모름";
		viewDay = new Date();
	}
	public Movie(String title, String director, Date viewDay) {
		this.title = title;
		this.director = director;
		this.viewDay = viewDay;
	}
	public Movie(String title, String director) {
		super();
		viewDay = new Date();
	}
	
	public String toString() {
		String rslt = "제목:" + title + "\n감독:" + director + "\n관람일" +  viewDay;
		return rslt;
	}
}
