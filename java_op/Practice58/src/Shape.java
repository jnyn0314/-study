/*
class Shape  {
    int x, y;
   
   void print() {
      System.out.println("(" + x + ", " + y + ")");
   }
}
class Circle extends Shape  {
       int radius;
   
   public Circle(int radius) {
      this.radius = radius;
      
      x = 0;
      y = 0;
   }
   double getArea() {
      return 3.14 * radius * radius;
   }
   double getCircum() {
      return 2 * 3.14 * radius;
   }
   void draw(int radius){
      print();
      System.out.print(" :: 반지름: " + radius + " :: 면적: "
            + String.format("%.2f", getArea()) + " :: 둘레: " + String.format("%.2f", getCircum()));
   }
}
*/
class Shape{
	int x, y;
	
	void print() {
		System.out.print("(" + x + "," + y + ")");
	}
}