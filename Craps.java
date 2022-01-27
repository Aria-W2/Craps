
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to play a game (y/n)?");
        String ans1 = in.nextLine();
        while (ans1.equals("y"))
        {
            System.out.println("Do you need instructions? (y/n)");
            String ans2 = in.nextLine();
            if (ans2.equals("y"))
            {
                System.out.println("1. Roll two six-sided dice.");
                System.out.println("2. On first roll, if you get a 7 or 11 you win!");
                System.out.println("3. On first roll, if you get a 2, 3, or 12 you lose!");
                System.out.println("4. Any other number you don't win or lose. The die roll becomes your 'point.'");
                System.out.println("5.  Keep rolling the dice again until:");
                System.out.println("    a. You roll the point again and win!");
                System.out.println("    b. or you roll a 7 and lose.");
                System.out.println(" ");
                System.out.println("Let's play!");
            }
            System.out.println("Press <enter> to roll dice...");
            String ans3 = in.nextLine();
            Die r = new Die();
            int point = r.roll();
            if (ans3.equals(""))
            {
                if (point == 7 || point == 11)
                {
                    System.out.println("You've rolled: " + point);
                    System.out.println("You won!");
                    System.out.println("Do you want to play a game (y/n)?");
                    ans1 = in.nextLine();
                    continue;
                }
                else if (point == 2 || point == 3 || point == 12)
                {
                    System.out.println("You've rolled: " + point);
                    System.out.println("You lose!");
                    System.out.println("Do you want to play a game (y/n)?");
                    ans1 = in.nextLine();
                    continue;
                }
                else
                {
                    System.out.println("You've rolled: " + point);
                    System.out.println("That's your point.");
                    System.out.println("Roll again!");
                }
            }
            System.out.println("Press <enter> to roll dice...");
            ans3 = in.nextLine();
            if (ans3.equals(""))
            {
                int num = r.roll();
                while (num != point && num != 7)
                {
                    System.out.println("You rolled: " + num); 
                    System.out.println("Roll again!");
                    System.out.println("Press <enter> to roll dice...");
                    num = r.roll();
                    ans3 = in.nextLine();
                }
                if (num == point)
                {
                    System.out.println("You rolled: " + num); 
                    System.out.println("You rolled your point! You won!");
                }
                else if (num == 7)
                {
                    System.out.println("You rolled: " + num); 
                    System.out.println("You rolled a 7 :( You lose!");
                }
            }
            System.out.println("Do you want to play again (y/n)?");
            ans1 = in.nextLine();
        }
    }
}

/*

COMMENTS FROM THE INSTRUCTOR:

This is a great little program, Aria, and it implements the rules of the
game of Craps perfectly. I especially like the `while`-loops you set up
to manage multiple games and the multiple die rolls that occur in the
second part of the game.

You didn't include your name or date in the JavaDocs, so it wasn't clear
at first who had written this program. Fortunately your name showed up
in the git log so I was able to figure out that it was you!

ALSO, the handout specifically mentioned writing the program so that
someone playing the game could, for Yes or No questions, just hit the
[Enter] key to indicate a default value. This makes the game run even
more smoothly, and it's a very usuful tool. You should check that out
and make sure you incorporate it into future projects, where appropriate.

Otherwise, *very* nice work, Aria. I'm looking forward to seeing what
you come up with in our future projects!

SCORE: 48/50

*/

