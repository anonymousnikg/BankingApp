package OOPs;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
       Accounts acc=null;
       Scanner sc= new Scanner(System.in);

       while(true){
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Details");
        System.out.println("5. Exit");
       }
       System.out.print("Enter an option:");
       int opt=sc.nextInt();

       switch(opt){
        case 1:
           if(acc==null){
            System.out.println("Enter account number: ");
            long acno =sc.nextLong();
            sc.nextLine();
            
            System.out.println("Enter account holder's name: ");
            String name= sc.nextLine();

            System.out.println("Enter initial deposit: ");
            float amt = sc.nextFloat();

            acc = new Accounts(acno,name,amt);
            System.out.println("Account Created!");
           }else{
            System.out.println("Account is already Created.");
           }
           break;
        case 2://deposit
            if(acc !=null){
                System.out.println("Enter amount to deposit:");
                float amt=sc.nextFloat();
                acc.deposit(amt);
            }else{
                System.out.println("You don't have an account. Create an account first! ");
            }

           break;
        case 3://withdraw
        if(acc !=null){
            System.out.println("Enter amount to withdraw:");
            float amt=sc.nextFloat();
            acc.withdraw(amt);
        }else{
            System.out.println("You don't have an account. Create an account first! ");
        } 
           break;
        case 4://details
        if(acc !=null){
            acc.getBalance();
        }else{
            System.out.println("You don't have an account. Create an account first! ");
        }
           break;
        case 5:
            System.out.println("---BYE BYE---");
            System.exit(0);
           break;
           defaut:
           System.out.println("Invalid Option, Try Again.");
       }

    }
    
}
