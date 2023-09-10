// 20220803 컴퓨터학과 정여진
public class Box {
	private int x;
	private int y;
	private int z;
	private boolean empty;
	
	public void fillBox() {this.empty = false;}
	public void emptyBox() {this.empty = true;}
	
	public String toString() {
		String rslt = "가로:" + x + "cm\n세로:" + y + "cm\n높이:" + z + "cm";
		if(empty)
			return rslt + "\n지금 박스에는 물건이 들어 있습니다.";
		else
			return rslt + "\n지금 박스는 비어있습니다.";
		
	}

	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	public int getZ() {return z;}
	public void setZ(int z) {this.z = z;}
	
	public Box() {this(0, 0, 0);} 
	public Box(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
