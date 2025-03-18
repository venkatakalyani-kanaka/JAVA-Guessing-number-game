//Guessing Number GAME
//this is modified some what
import java.util.Scanner;
import java.util.Random;

public class Guessingnumber{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String play="yes";
        while(play.equals("yes"))
        {
            Random rand=new Random();
            int randNum=rand.nextInt(100)+1;
            int guess=-1;
            int tries=0;
            while(guess!=randNum)
            {
                System.out.print("Guess a number between 1 and 100: ");
                guess=sc.nextInt();
                tries++;
                if(guess==randNum)
                {
                    System.out.println("Congrats!you guessed the number!");
                    System.out.println("Its only took you "+tries+" guesses");
                    System.out.println("Would you like to play again?Yes or No:");
                    play=sc.next().toLowerCase();
                }
                else if(guess>randNum)
                {
                    System.out.println("your guess is too high,try again");
                }
                else{
                    System.out.println("your guess is too low,try again");
                }
            }
        }
        sc.close();
    }
}
