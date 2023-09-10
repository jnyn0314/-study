import java.util.Scanner;


public class Practice59 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        
	        // 여기에 필요한 코드를 작성하세요.
	        Animal animal = new Animal();
	        
	        System.out.println("Animal에 객체 animal을 생성합니다.");
	        System.out.print("사진에 추가할 문장을 입력하세요:");
	        animal.picture = sc.next();
	        System.out.print("몸무게를 입력하세요:");
	        animal.setWeight(sc.nextDouble());
	        
	        animal.eat();
	        System.out.println("");
	        
	        Lion buba = new Lion();
	        
	        System.out.println("Lion에 객체 buba를 생성합니다.");
	        System.out.print("사진에 추가할 문장을 입력하세요:");
	        buba.picture = sc.next();
	        System.out.print("몸무게를 입력하세요:");
	        buba.setWeight(sc.nextDouble());
	        
	        buba.roar();
	        System.out.println("\n");
	        
	        Eagle paco = new Eagle();
	        System.out.println("Eagle에 객체 paco을 생성합니다.");
	        System.out.print("사진에 추가할 문장을 입력하세요:");
	        paco.picture = sc.next();
	        System.out.print("몸무게를 입력하세요:");
	        paco.setWeight(sc.nextDouble());
	        
	        paco.fly();
	        System.out.print("");
	            
	        System.out.println("Animal 객체 animal의 정보입니다.");
	        System.out.println(animal.StringtoString());
	        System.out.println("Lion 객체 buba의 정보입니다.");
	        System.out.println(buba.StringtoString());
	        System.out.println("Eagle 객체 paco의 정보입니다.");
	        System.out.println(paco.StringtoString());
	        System.out.println("\n");
	        
	        sc.close();
	}
}
