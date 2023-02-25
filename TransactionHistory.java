import java.time.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionHistory {
    Scanner scn=new Scanner(System.in);
    ArrayList<Transaction> transaction=new ArrayList<Transaction>();
    public void addNewTransaction(int type_of_Transaction, int amount){
        switch(type_of_Transaction){
            case 1:
                transaction.add(new Deposit(amount));
                break;
            case 2:
                transaction.add(new Withdraw(amount));
                break;
            case 3:
                System.out.println("Enter account number you want to transfer to: ");
                int acc=scn.nextInt();
                transaction.add(new Transfer(amount,acc));
                break;
        }
    }
    public void printHistory(){
        for(Transaction t:transaction){
            System.out.println(t);
        }
    }
}
