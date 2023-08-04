import java.util.*;
class NumberGuessingGame
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Random ran = new Random();
        int randomNumber = ran.nextInt(100)+1;
        int trycount=0;
        //System.out.println("Random number is : "+randomNumber);
        while(true)
        {
        System.out.println("enter your guess from 1 to 100:");
        int guess =scan.nextInt();
        trycount++;
        if(guess==randomNumber)
        {
            System.out.println("Correct! You Won!");
            System.out.println("!!!You took "+trycount+" tries to guess the number!!!");
            break;
        }
        else if(guess>randomNumber)
        {
            System.out.println("Oops!Your Guess is higher.Try Again.");
        }
         else
        {
            System.out.println("Oops!Your Guess is lower.Try Again.");
        }
    }

    }

}