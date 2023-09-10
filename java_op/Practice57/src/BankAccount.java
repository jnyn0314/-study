// 20220803 컴퓨터학과 정여진
import java.util.Random;

public class BankAccount {

 Random rd = new Random();
private String name, accountNo;
private int balance;
private double interest;

public void setName(String n) { name = n;}
public void setAccountNo(String a) {accountNo = a;}
public void setBalance(int b) {balance = b;}
public void setRate(double r) {interest = r;}

public String getName() {return name;}
public String getAccountNo() {return accountNo;}
public int balance() {return balance;}
public double rate() {return interest;}

public String toString() {
String bank;
bank = accountNo +" :: " + name + " :: " + balance + "원 :: " + interest + "%";
return bank;
 }
private int calcInterest() {
double interate;
interate = interest * (double)balance / 100;
return (int)interate;
 }
private String makeID() {
return (rd.nextInt(9000) + 1000) + "-" + (rd.nextInt(9000) + 1000);
}
public BankAccount() {
this("모름", 0);
 }
public BankAccount(String name, int balance) {
this(name, balance, 0);
 }
public BankAccount(String name, int balance, double interest) {

this.name = name;
this.balance = balance;
this.interest = interest;
this.accountNo = makeID();
}
public boolean deposit(int money) {
if (money < 0) {
return false;
}
this.balance += money;
return true;
 }
public boolean withdraw(int money) {
if (money > this.balance) {
return false;
}
this.balance -= money;
return true;
 }
public static boolean transfer(BankAccount from, BankAccount to, int money) {
if (money > from.balance) {
return false;
 }
from.balance -= money;
to.balance += money;
return true;
 }
}
  

