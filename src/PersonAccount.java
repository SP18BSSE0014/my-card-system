import java.util.Date;

public class PersonAccount {

    private double discount;
    private Bank bank;

    public PersonAccount(Bank bank , double discount) {
        this.bank = bank;
        this.discount = discount;
    }


    public double account(double discount , double discountPercent){
        discount *= discountPercent;
        discount /= 100;
        return discount;
    }

    public double purchase (double amount) {
        return amount;
    }

    public String TranssectionalHistory(Date start , Date end){
        return "Starting date: " + start + "Ending date: " + end;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
