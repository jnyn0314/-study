// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
import java.util.Random;
public class Practice30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data;
		
		data = getData(20);
		displayArray(data);
		findMax(data);
	}
	public static int[] getData(int num) {
		int[] rslt = new int[num];
		Random r = new Random();
		int i;
		
		for(i = 0; i < rslt.length; i++)
		rslt[i] = r.nextInt(100);
		
		return rslt;
	}
	public static void displayArray(int[] iArray) {
		int i;
	
		System.out.println("생성된 난수는 다음과 같습니다.");
		
		for(i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + "\t");
			}
		}
	public static int findMax(int[] iArray){
		int max = - 99999999;
		int i;
		
		for(i = 0; i < iArray.length; i++)
			if(iArray[i] > max)
				max = iArray[i];
		
		System.out.println("\n가장 큰 숫자는 " + max + "입니다.");
		
		return 0; // 왜 안쓰면 오류나는지?
	}
}
