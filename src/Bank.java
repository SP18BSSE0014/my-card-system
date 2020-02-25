import java.util.Date;

public class Bank {

    private Person person;
    private Account account;
    private int numberOfEmployees;
    private Date date;

    public Bank(Person person, Account account, int numberOfEmployees, Date date) {
        this.person = person;
        this.account = account;
        this.numberOfEmployees = numberOfEmployees;
        this.date = date;
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

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
