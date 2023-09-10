// 20220803 컴퓨터학과 정여진
/*
import java.util.Scanner;

public class Practice56 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

Movie m1 = new Movie();

System.out.println("영화 정보를 입력하세요");
System.out.print("영화제목은? ");
m1.setTitle(input.next());
System.out.print("감독은? ");
m1.setDirector(input.next());
System.out.print("제작년도는? ");
m1.setYear(input.nextInt());

Movie m2 = new Movie();
System.out.println("영화 정보를 입력하세요");
System.out.print("영화제목은? ");
m2.setTitle(input.next());
System.out.print("감독은? ");
m2.setDirector(input.next());
System.out.print("제작사는? ");
m2.setYear(input.nextInt());

Movie m3 = new Movie();
System.out.println("영화 정보를 입력하세요");
System.out.print("영화제목은? ");
m3.setTitle(input.next());
System.out.print("감독은? ");
m3.setDirector(input.next());
System.out.print("제작사는? ");
m3.setYear(input.nextInt());

System.out.println("입력한 영화의 정보입니다.\n");

System.out.println(m1.toString() + "\n");
System.out.println(m2.toString() + "\n");
System.out.println(m3.toString() + "\n");

System.out.println(Movie.compareMovies(m1, m2));
System.out.println(Movie.compareMovies(m1, m3));
System.out.println(Movie.compareMovies(m2, m3));

input.close();
 }
}
*/


import java.util.Scanner;

public class Practice56 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Movie m1 = new Movie();
	
	System.out.println("영화 정보를 입력하세요.");
	System.out.print("영화제목은?");
	m1.setTitle(sc.next());
	System.out.print("감독은?");
	m1.setDirector(sc.next());
	System.out.print("제작년도는?");
	m1.setYear(sc.nextInt());
	
	Movie m2 = new Movie();
	
	System.out.println("영화 정보를 입력하세요.");
	System.out.print("영화제목은?");
	m2.setTitle(sc.next());
	System.out.print("감독은?");
	m2.setDirector(sc.next());
	System.out.print("제작년도는?");
	m2.setYear(sc.nextInt());
	
	Movie m3 = new Movie();
	
	System.out.println("영화 정보를 입력하세요.");
	System.out.print("영화제목은?");
	m3.setTitle(sc.next());
	System.out.print("감독은?");
	m3.setDirector(sc.next());
	System.out.print("제작년도는?");
	m3.setYear(sc.nextInt());
	
	System.out.println("입력한 영화의 정보입니다.\n");
	System.out.print("번호:");
	m1.makeID();
	System.out.print("제목:");
	
	System.out.print("감독:");
	
	System.out.print("제작년도:");
	sc.close();
	}
}
