/*
class Box {
private int x;
private int y;
private int z;
private boolean empty;

String StringtoString() {

String rslt = "가로: " + x + "cm\n세로: " + y + "cm\n높이: " + z + "cm\n";

if (empty)
return rslt + "지금 박스는 비어있습니다.\n";
else
return rslt + "지금 박스에는 물건이 들어있습니다.\n";
 }

void setX(int x) {this.x = x;}
void setY(int y) {this.y = y;}
void setZ(int z) {this.z = z;}

int getX() {return x;}
int getY() {return y;} 
int getZ() {return z;}

 void fillBox() {

this.empty = false;
 }
void emptyBox() {
this.empty = true;
 }
    
 Box() {
this(0, 0, 0);
 }

 Box(int x, int y, int z) {

this.x = x;
this.y = y;
this.z = z;

emptyBox();
 }
}

class MaterialBox extends Box{
private String attribute;
 void setAttribute(String attribute) {this.attribute = attribute;};
 String getAttribute() {return attribute;};
 MaterialBox(int x, int y, int z, String attribute) {

setX(x);
setY(y);
setZ(z);
    
this.attribute = attribute;
 }
}
*/

public class Box{
	private int x;
	private int y;
	private int z;
	private boolean empty;
	
	public void fillBox(){
		this.empty = empty;
	}
	public void emptyBox(){
		this.empty = empty;
	}
	
	public String toString() {
		String rslt = "가로:" + x + "cm\n세로:" + y + "cm\n높이:" + z + "cm";
		if(empty) {
			return rslt + "\n지금 박스에는 물건이 들어 있습니다.";
		}
		else
			return rslt + "\n지금 박스는 비어있습니다.";
	}
	
	public int getX(){
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public Box(int z, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     