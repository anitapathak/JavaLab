package bankInfo;

public abstract class bankAccount {
private int accno=9467521;
private double balance=1000;
public abstract void deposite(int amount);
public abstract void withdraw( int amount);
public void setAccno(int accno) {
    this.accno = accno;
}
public void setBalance(double balance) {
    this.balance = balance;
}

public int getAccno() {
    return accno;
}
public double getBalance() {
    return balance;
}
}
