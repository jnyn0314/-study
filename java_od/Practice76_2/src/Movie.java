
public class Movie {
	private String title;
	private String director;
	private Date viewDay;
	// setters getters
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
		super();
		viewDay = new Date(1999, 9, 9);
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
		String rslt = "";
		return rslt;
	}
}
