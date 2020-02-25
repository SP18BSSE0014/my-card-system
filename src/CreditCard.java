import java.util.Date;

public class CreditCard extends PersonAccount{

    private Person person;
    private Account account;
    private String barcode;
    private String PIN;
    private boolean active;
    private Date expire;
    private double balance;
    private NationalCard nationalCard;

    public CreditCard(Bank bank, double discount, Person person, Account account, String barcode, String PIN, boolean active, Date expire,double balance, NationalCard nationalCard) {
        super(bank, discount);
        this.person = person;
        this.balance = balance;
        this.account = account;
        this.barcode = barcode;
        this.PIN = PIN;
        this.active = active;
        this.expire = expire;
        this.nationalCard = nationalCard;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
