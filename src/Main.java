import Opps.BankAccount;
import Opps.Encapsulation;
import Opps.pet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Encapsulation myObj= new Encapsulation();
        myObj.setName("Vivek");
        System.out.println(myObj.getName());

        pet petName1=new pet();
        petName1.setPetName("Dog");
        System.out.println(petName1.getName());

        // Bank Deposit and withdraw

        // Create a new BankAccount instance
        BankAccount account= new BankAccount("Vivek", 500000.0);

        // Display account information
        System.out.println("Account Holder name: "+ account.getAccountHolderName());
        System.out.println("Initial Blance; "+ account.getBalance());

        //Perform some transactions
        account.deposit(500);
        System.out.println("Balance after Deposit: "+ account.getBalance());

        account.withdraw(1000);
        System.out.println("Balance after withdraw: "+account.getBalance());

    }
}