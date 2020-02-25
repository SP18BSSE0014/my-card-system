public class Account {

    private double balance;
    private double intrest;
    private String accountType;
    private int accountNumber;
    private int totalWithdrawal;
    private int totalDeposit;


    public Account(double balance, double intrest, String accountType, int accountNumber, int totalWithdrawal, int totalDeposit) {
        this.balance = balance;
        this.intrest = intrest;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.totalWithdrawal = totalWithdrawal;
        this.totalDeposit = totalDeposit;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getIntrest() {
        return intrest;
    }

    public void setIntrest(double intrest) {
        this.intrest = intrest;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getTotalWithdrawal() {
        return totalWithdrawal;
    }

    public void setTotalWithdrawal(int totalWithdrawal) {
        this.totalWithdrawal = totalWithdrawal;
    }

    public int getTotalDeposit() {
        return totalDeposit;
    }

    public void setTotalDeposit(int totalDeposit) {
        this.totalDeposit = totalDeposit;
    }

}
