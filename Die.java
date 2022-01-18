
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Die
{
    // instance variables - replace the example below with your own
    private int dice1;
    private int dice2;
    private int sum;
    private int point;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        dice1 = 0;
        dice2 = 0;
        sum = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int roll()
    {
        dice1 = (int)(Math.random()*6 + 1);
        dice2 = (int)(Math.random()*6 + 1);
        sum = dice1 + dice2;
        return sum;
    }
    
    public String result1()
    {
        if (sum == 7 || sum == 11)
        {
            return "You've won the game!";
        }
        else if (sum == 2 || sum == 3 || sum == 12)
        {
            return "You've lost the game.";
        }
        else
        {
            point = sum; 
            return "That's your point. Let's see if you can roll again before getting a 7!";
        }
    }
    
    public String result2()
    {
        if (sum == point)
        {
            return "You rolled your point! You win!";
        }
        else
        {
            return "Keep rolling...";
        }
    }
}
