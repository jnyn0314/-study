import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E, S, M;
        E = sc.nextInt();
        S = sc.nextInt();
        M = sc.nextInt();

        // 최소공배수 계산
        int lcm = lcm(15, lcm(28, 19));

        // 각 수에 대한 공배수 계산
        int earthYear = (E - 1) * (lcm / 15) + 1;
        int sunYear = (S - 1) * (lcm / 28) + 1;
        int moonYear = (M - 1) * (lcm / 19) + 1;

        // 세 개의 수가 같은 공배수일 때 출력
        int result = findCommonMultiple(earthYear, sunYear, moonYear);
        System.out.println(result);
        
        sc.close();
    }

    // 최대 공약수 구하기
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 최소 공배수 구하기
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // 공통 배수 찾기
    public static int findCommonMultiple(int a, int b, int c) {
        int year = Math.min(a, Math.min(b, c));
        while (true) {
            if (year % 15 == a - 1 && year % 28 == b - 1 && year % 19 == c - 1) {
                return year;
            }
            year += 15;
        }
    }
}

