// 20220803 컴퓨터학과 정여진
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;
public class Practice79 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String file_name = sc.next();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
		PrintWriter pw = new PrintWriter(new FileWriter(file_name));
		
		for(int value : list) {
			pw.print(value);
		}
		if(pw!=null) {
			pw.close();
		}

		}catch(IOException e) {
			e.printStackTrace();
		}

		sc.close();
	} 
}
