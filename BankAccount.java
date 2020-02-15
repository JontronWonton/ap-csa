// Jonathan Klein
// 2/4/20
// BankAccount.java

public class BankAccount {
    private int balance;
    private int accountNum;
    private static int totalAccounts = 0;

    public BankAccount(){
        accountNum = totalAccounts;
        totalAccounts++;
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
