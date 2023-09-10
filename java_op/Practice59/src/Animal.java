
public class Animal {
	  private double weight;
	    String picture;
	    
	    void setWeight(double weight){this.weight = weight;}
	    double getWeight(){return weight;}
	    
	    void eat(){System.out.print("eat()가 호출되었음");}
	    void sleep(){System.out.print("sleep()가 호출되었음");}
	    
	    public String StringtoString()
	    {
	        return "몸무게" + weight + "kg - 그림설명: " + picture;
	    }}

	class Lion extends Animal {
	    private int legs = 4;
	    
	    void roar(){
	        eat();
	        System.out.print(":");
	        System.out.println("roar()가 호출되었음");
	    }
	    
	    public String StringtoString(){
	        return "몸무게:" + getWeight() + "kg - 그림설명: " + picture + "-다리:" + legs;
	    }
	}

	class Eagle extends Animal {
	 private int wings = 0;
	    
	    void fly(){
	        sleep();
	        System.out.print(":");
	        System.out.println("fly()가 호출되었음");
	    }
	    
	    public String StringtoString(){
	        String s;
	        s = "몸무게" + getWeight() + "kg - 그림설명: " + picture + "-날개:" + wings;
	        return s;
	    }    
}
