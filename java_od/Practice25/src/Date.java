// 20220803 컴퓨터학과 정여진
public class Date{
		private int year;
		private int month;
		private int day;
		
		// 접근자, 생성자
		
		public int getYear() {
			return year;
		}
		public void setYear(int y) {
			year = y;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int m) {
			month = m;
		}
		public int getDay() {
			return day;
		}
		public void setDay(int d) {
			day = d;
		}
		
		// 생성자 => 필드 초기화용, 클래스 이름과 똑같아야 함
		
		public Date() {
			year = 1990;
			month = 1;
			day = 1;
		} // 매개변수가 없는 생성자는 변수 값 = 특정 값 으로 초기화하고
		public Date(int y) {
			year = y;
		} // 매개변수가 있는 생성자는 변수 값 = 매개 변수 로 한다.
		public Date(int y, int m) {
			year = y;
			month = m;
		}
		public Date(int y, int m, int d) {
			year = y;
			month = m;
			day = d;
		}
		
		public String toString() {
			String rslt = getYear() + "년 " + getMonth() + "일 " + getDay() + "일";
			
			return rslt;
		}
	}
