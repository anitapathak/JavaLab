package bankInfo;
import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
    savingAccount S= new savingAccount();
    System.out.println("enter the amount to deposite in current and savining account");
    int  a=Sc.nextInt();
    int  b=Sc.nextInt();
    System.out.println("enter the amount to withdram from cuurent and saving account:");
    int  W1=Sc.nextInt();
    int  w2=Sc.nextInt();

    S.deposite(a);
    S.withdraw(W1);
    CurrentAccount C= new CurrentAccount();
    C.deposite(b);
    C.withdraw(w2);

}
}
