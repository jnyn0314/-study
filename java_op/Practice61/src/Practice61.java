/*
public class Practice61{
public static void main(String[] args) {
MaterialBox box1 = new MaterialBox(2, 3, 4, "wood");
MaterialBox box2 = new MaterialBox(10, 5, 5, "paper");

System.out.println("box1의 정보입니다.");
System.out.println("가로: " + box1.getX() + ", 세로: " + box1.getY() + ", 높이: " + box1.getZ());
System.out.println("재질: " + box1.getAttribute());
System.out.println("부피: " + (box1.getX() * box1.getY() * box1.getZ()));
System.out.println("무게: " + 1.1 * (box1.getX() * box1.getY() * box1.getZ()) + "\n");

System.out.println("box1의 정보입니다.");
System.out.println("가로: " + box2.getX() + ", 세로: " + box2.getY() + ", 높이: " + box2.getZ());
System.out.println("재질: " + box2.getAttribute());
System.out.println("부피: " + (box2.getX() * box2.getY() * box2.getZ()));
System.out.println("무게: " + 1.1 * (box2.getX() * box2.getY() * box2.getZ()));

}
}
*/
import java.util.Scanner;

public class Practice61{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Box b1 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
	System.out.println("box1의 정보입니다.");
	System.out.println(b1.toString());
	
	
	
	
	sc.close();
	}
}
