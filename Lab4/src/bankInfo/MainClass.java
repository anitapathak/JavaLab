package bankInfo;

public class MainClass {
public static void main(String[] args) {
    savingAccount S= new savingAccount();
    S.deposite(1000);
    S.withdraw(1000);
    CurrentAccount C= new CurrentAccount();
    C.deposite(2000);
    C.withdraw(2000);

}
}
