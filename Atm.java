import java.util.Scanner;

public class Atm {
    public static int balance=100000;
   public static void main(String[] args) {
       int choice=1;
       int updatedbalance=balance;
       Scanner sc= new Scanner(System.in);
        do
        {
            System.out.println("Welcome to the ATM");
            System.out.println("1.Check Balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Exit");
        
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your current balance:");
                System.out.println(updatedbalance);
                break;
            case 2:
                System.out.println("Enter amount for withdrawal:");
                int withdrawAmount=sc.nextInt();
                updatedbalance=withdraw(updatedbalance,withdrawAmount);
                break;
            case 3:
                System.out.println("Enter Deposit amount:");
                int depositAmount=sc.nextInt();
                updatedbalance=deposit(updatedbalance,depositAmount);
                break;
            case 4: System.out.println("Thank you for using our ATM services");
                System.exit(1);
            default:
                break;
        }
    } while(choice!=4);
    sc.close();
    }
    public static int withdraw(int balance,int withdrawAmount)
        {  
           
            if (withdrawAmount<=balance)
                {
                    System.out.println("Amount withdraw successful!");
                    return balance-withdrawAmount;
                }
            else
                {
                    System.out.println("Insufficient balance");
                    return balance;
                }
        }
        public static int deposit(int balance,int depositAmount)
        {   
             System.out.println("Deposit successful!");
             return depositAmount+balance;
        } 
}
