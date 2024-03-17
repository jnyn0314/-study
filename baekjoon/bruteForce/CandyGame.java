import java.util.Scanner;

public class CandyGame {

    public static void main(String[] args) {
        int size;
        String[][] color;

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        color = new String[size][size]; // Initialize color array with appropriate size

        for (int i = 0; i < size; i++) {
            color[i] = sc.next().split("");
        }
        
        int maxCount = getMaxContinuousCount(color, size);
        System.out.println(maxCount);
    }

    public static int getMaxContinuousCount(String[][] color, int size) {
        int max = 1; // Minimum length of continuous candies

        // Check rows
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                // Swap adjacent candies and check the length of continuous candies
                String temp = color[i][j];
                color[i][j] = color[i][j + 1];
                color[i][j + 1] = temp;
                
                int currentCount = countContinuous(color, size);
                max = Math.max(max, currentCount);
                
                // Revert the swap
                temp = color[i][j];
                color[i][j] = color[i][j + 1];
                color[i][j + 1] = temp;
            }
        }

        // Check columns
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size - 1; i++) {
                // Swap adjacent candies and check the length of continuous candies
                String temp = color[i][j];
                color[i][j] = color[i + 1][j];
                color[i + 1][j] = temp;
                
                int currentCount = countContinuous(color, size);
                max = Math.max(max, currentCount);
                
                // Revert the swap
                temp = color[i][j];
                color[i][j] = color[i + 1][j];
                color[i + 1][j] = temp;
            }
        }

        return max;
    }

    public static int countContinuous(String[][] color, int size) {
        int max = 1; // Minimum length of continuous candies

        // Check rows
        for (int i = 0; i < size; i++) {
            int currentCount = 1;
            for (int j = 1; j < size; j++) {
                if (color[i][j].equals(color[i][j - 1])) {
                    currentCount++;
                    max = Math.max(max, currentCount);
                } else {
                    currentCount = 1; // Reset current count if colors are not same
                }
            }
        }

        // Check columns
        for (int j = 0; j < size; j++) {
            int currentCount = 1;
            for (int i = 1; i < size; i++) {
                if (color[i][j].equals(color[i - 1][j])) {
                    currentCount++;
                    max = Math.max(max, currentCount);
                } else {
                    currentCount = 1; // Reset current count if colors are not same
                }
            }
        }

        return max;
    }
}

