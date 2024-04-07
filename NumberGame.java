import java.util.Scanner;
class NumberGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean correct=false;
        String playAgain=" ";
        
        while(true) {
            int num=(int)(Math.random()*100+1);
            int attempts=0;
            System.out.println("Welcome to Number Guess Game");
            while(attempts<5)
            {  
                System.out.println("Guess a number between 1 and 100:");
                int guess=sc.nextInt();
                attempts++;
                if(guess>num)
                {
                    System.out.println("Your guess is greater");
                    System.out.println("You have "+(5-attempts)+" guesses left!");
                }
                else if(guess<num)
                {
                    System.out.println("Your guess is lower");
                    System.out.println("You have "+(5-attempts)+" guesses left!");
                }
                else
                {
                    System.out.println("Correct Guess!!");
                    correct=true;
                    break;
                }
            }
            if(correct==false)
            {
            System.out.println("You lose..");
            }
            sc.nextLine();
            System.out.println("Do you wnat to continue? (yes/no) ");
            playAgain = sc.nextLine();

            if(!playAgain.equalsIgnoreCase("yes"))
            {
                sc.close();
                System.exit(0);
            }
        }
    }
}
