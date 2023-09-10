
import java.util.Scanner;

public class Practice58 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      Shape s = new Shape();
      
      Circle c1 = new Circle(0);
      Circle c2 = new Circle(0);
      
      s.x = sc.nextInt();
      s.y = sc.nextInt();
      c1.x = sc.nextInt(); 
      c1.y = sc.nextInt();
      c1.radius = sc.nextInt();
      c2.x = sc.nextInt();
      c2.y = sc.nextInt();
      c2.radius = sc.nextInt();
      
      System.out.println("Shape 객체 정보입니다.");
      s.print();
      System.out.println("첫번째 Circle 객체 정보입니다.");
      c1.draw(c1.radius);
      System.out.println("두번째 Circle 객체 정보입니다.");
      c2.draw(c2.radius);
      
      if(compareArea(c1,c2) == -1)
         System.out.println("첫 번째 원의 면적이 더 넓습니다.");
      else if(compareArea(c1,c2) == 0)
         System.out.println("두 원의 면적이 같습니다.");
      else
         System.out.println("두 번째 원의 면적이 더 넓습니다.");
      
      sc.close();
   }
      public static int compareArea(Circle c1, Circle c2) {
         if(c1.getArea() > c2.getArea())
            return -1;
         else if(c1.getArea() == c2.getArea())
            return 0;
         else
            return 1;
      }
}
/*
import java.util.Scanner;

public class Practice58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        Shape s = new Shape();
        System.out.println("Shape 객체 정보를 입력하세요.\n");
        System.out.println("x좌표:");
        s.x = sc.nextInt();
        System.out.println("y좌표:");
        s.y = sc.nextInt();
        
        Circle c1 = new Circle();
        System.out.println("첫번째 Circle 객체 정보를 입력하세요\n");
        System.out.println("x좌표:");
        c1.x = sc.nextInt();
        System.out.println("y좌표:");
        c1.y = sc.nextInt();
        
        
        Circle c2 = new Circle();
        sc.close();
    }    
}
*/