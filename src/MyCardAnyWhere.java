import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.System.exit;

public class MyCardAnyWhere {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date();

        Person person = new Person("Faraz",19,"male","0321-2481944",40224-345123123-9);
        Account account = new Account(1000000000.0 , 10,"personal",10085,12,10000);
        Bank bank = new Bank(person,account,142,date);
        PersonAccount personAccount = new PersonAccount(bank, 20);
        NationalCard nationalCard = new NationalCard(bank,20,person,account,"X3410","1234",200 , true,date);
        CreditCard creditCard = new CreditCard(bank,20,person,account,"Quzt","1234",true,date,20000,nationalCard);
        Travel travel = new Travel(true , person , nationalCard);
        Food food = new Food("briyani",20000,nationalCard);

        System.out.println("         ====================================================================");
        System.out.println("                         <><><><><><><><><><><><><><><><><>                     ");
        System.out.println("                         CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                      ");
        System.out.println("                         _________________________________                      ");
        System.out.println("                         |       WELCOME TO              |                      ");
        System.out.println("                         |                               |                      ");
        System.out.println("                         |                               |                      ");
        System.out.println("                         |    Maju Student Bank          |                      ");
        System.out.println("                         |           Scheme              |                      ");
        System.out.println("                         |                               |                      ");
        System.out.println("                         |              Sponsered by:    |                      ");
        System.out.println("                         |                  HBl and BPL  |                      ");
        System.out.println("                         <><><><><><><><><><><><><<><><><><>                    ");
        System.out.println("           0000000000000000000000000000000000000000000000000000000				");
        System.out.print("\n\t\tPress Any Key and Enter To Continue...");
        char a1 = input.next().charAt(0);


        for(int i = 1 ; i <= 24 ; i++){
            System.out.println("\n");
        }


        System.out.printf("\n\t\t\t=====================================================");
        System.out.printf("\n\n\t\t\t\tMyCardAnyWhere Customer Care Center");
        System.out.printf("\n\t\t\t=====================================================");
        System.out.printf("\n\n\n\t\t\t MAIN MENU ");
        System.out.printf("\n\t\t\t1.New Account\n");
        System.out.printf("\t\t\t2.Add Balance to your Account\n");
        System.out.printf("\t\t\t3.NationalCard Detials\n");
        System.out.printf("\t\t\t4.CreditCard Detials\n");
        System.out.printf("\t\t\t5.Travel\n");
        System.out.printf("\t\t\t6.Food\n");
        System.out.printf("\t\t\t7.Exit.\n");
        System.out.printf("\n\n\n\n\n\t\t Enter your choice[1-7]:");
        int choice = input.nextInt();

        if(choice == 1){

            System.out.println("Enter your name: ");
            String name = input.next();
            System.out.println("Enter your Age: ");
            int age = input.nextInt();
            System.out.println("Enter your sex: ");
            String sex = input.next();
            System.out.println("Enter your PhoneNumber: ");
            String phoneNumber = input.next();
            System.out.println("Enter your CNIC: ");
            long CNIC = input.nextLong();
            System.out.println("Enter your balance: ");
            double balance = input.nextDouble();
            System.out.println("enter the intrest: ");
            int intrest = input.nextInt();
            System.out.println("Enter the AccountType: ");
            String AccountType = input.next();
            System.out.println("Enter the Account Number: ");
            int accountNumber = input.nextInt();
            System.out.println("Enter the total withDrawal: ");
            int withdrawal = input.nextInt();
            System.out.println("Enter the totalDeposite: ");
            int totalDeposite = input.nextInt();

            Person person1 = new Person(name,age,sex,phoneNumber,CNIC);
            Account account1 = new Account(balance , intrest,AccountType,accountNumber,withdrawal,totalDeposite);

            System.out.println("your name: "+person1.getName());
            System.out.println("your Age: "+person1.getAge());
            System.out.println("your sex: "+person1.getGender());
            System.out.println("your PhoneNumber: "+person1.getPhoneNumber());
            System.out.println("your CNIC: "+person1.getCNIC());
            System.out.println("your balance: "+account1.getBalance());
            System.out.println("intrest: "+account1.getIntrest());
            System.out.println("AccountType: "+account1.getAccountType());
            System.out.println("Account Number: "+account1.getAccountNumber());
            System.out.println("total withDrawal: "+account1.getTotalWithdrawal());
            System.out.println("totalDeposite: "+account1.getTotalDeposit());

        }if(choice == 2){
            System.out.println("Enter Some Balance which add to existing ammount: ");
            double newAmount = input.nextDouble();

            double ammount = newAmount + account.getBalance();

            System.out.println("Your New Amount: "+ammount);

        }if(choice == 3){

            SimpleDateFormat SDF = new SimpleDateFormat("dd-mm-yyyy");

            System.out.println("your name: "+person.getName());
            System.out.println("your Age: "+person.getAge());
            System.out.println("your sex: "+person.getGender());
            System.out.println("your PhoneNumber: "+person.getPhoneNumber());
            System.out.println("your CNIC: "+person.getCNIC());
            System.out.println("your balance: "+account.getBalance());
            System.out.println("intrest: "+account.getIntrest());
            System.out.println("AccountType: "+account.getAccountType());
            System.out.println("Account Number: "+account.getAccountNumber());
            System.out.println("total withDrawal: "+account.getTotalWithdrawal());
            System.out.println("totalDeposite: "+account.getTotalDeposit());
            System.out.println("Your BarCode is:"+ nationalCard.getBarcode());
            System.out.println("Your Pin is: "+ nationalCard.getPIN());
            System.out.println("your account is active: "+ nationalCard.isActive());
            System.out.println("Todays date: "+ SDF.format(date));


        }if(choice == 4){

            SimpleDateFormat SDF = new SimpleDateFormat("dd-mm-yyyy");

            System.out.println("your name: "+person.getName());
            System.out.println("your Age: "+person.getAge());
            System.out.println("your sex: "+person.getGender());
            System.out.println("your PhoneNumber: "+person.getPhoneNumber());
            System.out.println("your CNIC: "+person.getCNIC());
            System.out.println("your balance: "+account.getBalance());
            System.out.println("intrest: "+account.getIntrest());
            System.out.println("AccountType: "+account.getAccountType());
            System.out.println("Account Number: "+account.getAccountNumber());
            System.out.println("total withDrawal: "+account.getTotalWithdrawal());
            System.out.println("totalDeposite: "+account.getTotalDeposit());
            System.out.println("Your BarCode is:"+ creditCard.getBarcode());
            System.out.println("Your Pin is: "+ creditCard.getPIN());
            System.out.println("your account is active: "+ creditCard.isActive());
            System.out.println("Todays date: "+ SDF.format(date));


        }if(choice == 5){
            System.out.println("Enter the place of travel: ");
            String travelled = input.next();
            System.out.println("Enter the ammout during travelling: ");
            double amount = input.nextDouble();

            double discount = (amount * personAccount.getDiscount()) / 100;

            if(nationalCard.getBalance() == 0 || nationalCard.getBalance() < amount ){
                System.out.println("Your bill is paid from creditCard: ");
                System.out.println("And is no discount in creditCard so , new bill is : "+amount);
            }else{
                System.out.println("You get discount of 20% and total bill get offd : "+discount);
                System.out.println("Your bill is paid from nationalCard: ");
            }

        }if(choice == 6){

            System.out.println("Enter the food name: ");
            String name = input.next();
            System.out.println("Enter the food price: ");
            double price = input.nextDouble();

            food.setFoodName(name);
            food.setFoodPrice(price);

            double discount = (food.getFoodPrice(price) * personAccount.getDiscount()) / 100;



            if(nationalCard.getBalance() == 0 || nationalCard.getBalance() < price){
                System.out.println("Your bill is paid from creditCard: ");
                System.out.println("And is no discount in creditCard so , new bill is : "+price);
            }else{
                System.out.println("You get discount of 20% and total bill get off : "+discount);
                System.out.println("Your bill is paid from nationalCard: ");
            }

        }if(choice == 7){
            exit(0);
        }

    }

}
