// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class Practice80 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input  = sc.next();
		// String output = sc.next();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
			Scanner scan = new Scanner(new FileReader(input));
			
			while(scan.hasNext()) {
				if(scan.hasNextInt()) {
					list.add(scan.nextInt()); // 여기서 계산 동작 수행
				}
				else {
					scan.next(); //skip
				}
			}
			if(scan != null) {
				scan.close();
			}
			
			// 여기다 출력문
		}catch() {
			
		}
		
		sc.close();
	}
	public static void printArray10PerLine(ArrayList<Integer> list) {
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		if((i + 1) % 10 == 0) {
			System.out.println();
			}
		}
	}
}
