import java.util.Scanner;

public class Practice62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount list[] = new BankAccount[3];
        int num, work, money;

        getAccInfo(sc, list); // 계좌 정보 입력받기
        printAccInfo(list); // 현재 계좌 상황 출력

        while (true) {
            try {
                num = getAccNum(sc, list, list.length); // 계좌번호 입력받기

                if (num == 0) {
                    break; // 0이 입력되면 종료
                }

                work = getOperationNum(sc); // 작업번호 입력받기

                if (work == 1) {
                    System.out.println("입금액을 입력하세요:");
                    money = sc.nextInt();
                    list[num - 1].deposit(num, money);
                    System.out.println("입금이 완료되었습니다.");
                } else if (work == 2) {
                    System.out.println("출금액을 입력하세요:");
                    money = sc.nextInt();
                    list[num - 1].withdraw(num, money);
                    System.out.println("출금이 완료되었습니다.");
                }
            } catch (NoSuchAccountException | NoSuchOperationException | NegativeBalanceException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }

    private static void getAccInfo(Scanner scan, BankAccount[] ba) {
        for (int i = 0; i < ba.length; i++) {
            ba[i] = new BankAccount();
            System.out.print("예금주 이름을 입력하세요:");
            ba[i].setOwner(scan.next());
            System.out.print("잔고를 입력하세요:");
            ba[i].setBalance(scan.nextInt());
        }
    }

    private static void printAccInfo(BankAccount[] ba) {
        System.out.println("현재 잔고현황입니다.");

        for (int i = 0; i < ba.length; i++) {
            System.out.println(i + 1 + "\t" + ba[i].toString());
        }
    }

    public static int getAccNum(Scanner scan, BankAccount[] ba, int arrayLength) throws NoSuchAccountException {
        System.out.print("계좌번호를 입력하세요:");
        int accNum = scan.nextInt();

        if (accNum < 0 || accNum > arrayLength) {
            throw new NoSuchAccountException();
        }

        return accNum;
    }

    private static int getOperationNum(Scanner scan) throws NoSuchOperationException {
        System.out.print("작업번호를 입력하세요:");
        int operationNum = scan.nextInt();

        if (operationNum != 1 && operationNum != 2) {
            throw new NoSuchOperationException("잘못된 작업번호입니다. 다시 입력하세요.");
        }

        return operationNum;
    }
}
