package bankInfo;

public class CurrentAccount extends bankAccount {
    double Balance=getBalance();
    @Override
    public void deposite(int amount){
       Balance=Balance+amount;
       System.out.println("the deposite amount is " + amount);
       System.out.println("the toal amount is " + Balance);

    }

    @Override
    public void withdraw(int amount){
       Balance=Balance-amount;
       System.out.println("the withdraw amount is " + amount);
       System.out.println("the toal amount is " + Balance);
    }
}
