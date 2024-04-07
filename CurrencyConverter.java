import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        int choice=0;
        float amount=0;
        Scanner sc= new Scanner(System.in);
        do
        {
            System.out.println("Welcome to Currency converter");
            System.out.println("1.Dollar");
            System.out.println("2.Euro");
            System.out.println("3.Rupee");
            System.out.println("4.Exit");
            System.out.println("Select currency/choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1: 
                    System.out.println("Enter amount: ");
                    amount=sc.nextFloat();
                    dollar_to_others(amount);
                    break;
                case 2: 
                    System.out.println("Enter amount: ");
                    amount=sc.nextFloat();
                    euro_to_others(amount);
                    break;
                case 3:
                    System.out.println("Enter amount: ");
                    amount=sc.nextFloat(); 
                    rupee_to_others(amount);
                    break;
                case 4: System.out.println("Thank you for using");
                System.exit(0);
                    break;
            }
        
        }while(choice!=4);
        sc.close();
    }
    public static void dollar_to_others(float amount)
    {
        System.out.println(amount+" dollars :");
        System.out.println((amount*83.30)+" rupees");
        System.out.println((amount*0.92)+" euros");
    }
    public static void euro_to_others( float amount)
    {
        System.out.println(amount+" euros :");
        System.out.println((amount*90.37)+" rupees");
        System.out.println((amount*1.08)+" dollars");
    }
    public static void rupee_to_others( float amount)
    {
        System.out.println(amount+" rupees :");
        System.out.println((amount*0.012)+" dollars");
        System.out.println((amount*0.011)+" euros");
    }

}
