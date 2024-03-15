package bruteForce;

import java.util.Scanner;

public class SevenDwarfs {
	
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int[] dwarfs = new int[9];
		
		 for (int i = 0; i < dwarfs.length; i++) {
	            dwarfs[i] = sc.nextInt();
	        }
		 
		 int[] sevenDwarfs = findSevenDwarfs(dwarfs);
		 orderDwarfs(sevenDwarfs);
		 printDwarfs(sevenDwarfs);
	}
    
	public static int[] findSevenDwarfs(int[] dwarfs) {
		int[] sevenDwarfs = new int[7];
		
		for(int i = 0; i < dwarfs.length - 1; i++) {
			for(int j = i + 1; j < dwarfs.length; j++) {
				int sum = 0;
				for(int k = 0, idx = 0; k < dwarfs.length; k++) {
					if(k != i && k != j) {
						sum += dwarfs[k];
						sevenDwarfs[idx++] = dwarfs[k];
					}
				}
				if(sum == 100)
					return sevenDwarfs;
			}
		}
		return null;
	}
	
    public static void orderDwarfs(int[] dwarfs) {
    	int i, j, temp = 0;
    	
    	for(i = 0; i < dwarfs.length; i++) {
    		for(j = 0; j < dwarfs.length; j++) {
    			if(dwarfs[i] < dwarfs[j]) {
    				temp = dwarfs[i];
    				dwarfs[i] = dwarfs[j];
    				dwarfs[j] = temp;
    			}
    		}
    	}
    }
    
    public static void printDwarfs(int[] dwarfs) {
    	for (int i = 0; i < dwarfs.length; i++) {
            System.out.println(dwarfs[i]);
        }
    }
}