package bankInfo;

public class savingAccount extends bankAccount {
    @Override
    public void deposite(int amount) {
        setBalance(getBalance() + amount);
        System.out.println("The deposit amount is " + amount);
        System.out.println("The total amount is " + getBalance());
    }

    @Override
    public void withdraw(int amount) {
        setBalance(getBalance() - amount);
        System.out.println("The withdraw amount is " + amount);
        System.out.println("The total amount is " + getBalance());
    }
}
