import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> Accounts =new ArrayList<Account>();
        Account a1=new Account(121,0000,2300,"Howard");
        Account a2=new Account (122,0001,9822,"Rajesh");
        Accounts.add(a1);
        Accounts.add(a2);
        Scanner sc=new Scanner(System.in);
        int id,pin;
        System.out.println("----------------WELCOME  TO  SBI  ATM----------------");
        System.out.println("Enter your login credentials=>");
        System.out.println("Enter your USER ID: ");
        id=sc.nextInt();
        System.out.println("Enter your USER PIN: ");
        pin=sc.nextInt();
        for(Account acc:Accounts){
            if(acc.getUser_pin()==pin && acc.getUser_id()==id){
                System.out.println("Welcome "+acc.accountHolder+ "\nYou are Logged in");
                acc.loggedIn();
            }
        }
    }

}
