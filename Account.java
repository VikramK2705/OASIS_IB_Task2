import java.util.ArrayList;
import java.util.Scanner;

class Account{
       private int user_id;
       Scanner scn=new Scanner(System.in);
       private int user_pin;
       private float balance;
       String accountHolder;
       Account(int user_id,int user_pin,float balance,String accountHolder){
           this.user_id=user_id;
           this.user_pin=user_pin;
           this.balance=balance;
           this.accountHolder=accountHolder;
       }
       public int getUser_id(){
           return this.user_id;
       }
       public int getUser_pin(){
           return this.user_pin;
       }
       private TransactionHistory transactionHistory=new TransactionHistory();

       public void loggedIn(){
           Scanner scn = new Scanner(System.in);
           int key;
           int amt;
           boolean flag=false;
           while(true){
               System.out.println("\n===========Choose from the following options===========");
               System.out.println("1.See your balance \n2.Deposit money \n3.Withdraw Money");
               System.out.println("4.Transfer Money\n5.Show Transaction History\n6.Logout");
               key= scn.nextInt();
               switch(key){
                   case 1:
                       System.out.println("Available Balance in your account is "+balance);
                       break;
                   case 2:
                       System.out.println("\n---------------------------DEPOSIT---------------------------");
                       System.out.println("Enter the amount you want to deposit: ");
                       amt=scn.nextInt();
                       transactionHistory.addNewTransaction(1,amt);
                       balance=balance+amt;
                       break;
                   case 6:
                       System.out.println("You are logged out.");
                       System.out.println("Thank you for visiting "+this.accountHolder);
                       flag=true;
                       break;
                   case 3:
                       System.out.println("\n---------------------------WITHDRAW---------------------------");
                       System.out.println("Enter the amount you want to withdraw: ");
                       amt=scn.nextInt();
                       balance=balance-amt;
                       transactionHistory.addNewTransaction(2,amt);
                       break;
                   case 4:
                       System.out.println("\n---------------------------TRANSFER MONEY------------------------");
                       System.out.println("Enter the amount: ");
                       amt=scn.nextInt();
                       balance=balance-amt;
                       transactionHistory.addNewTransaction(3,amt);
                       break;
                   case 5:
                       transactionHistory.printHistory();
                       break;
                   default:
                       System.out.println("Invalid Option");

               }
               if(flag)
                   break;
           }
       }
}