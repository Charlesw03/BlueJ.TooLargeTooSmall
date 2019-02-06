
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Main
{
        public static void main(String[] args) {
                  int secretNumber;
                secretNumber =(int) (Math.random() * 10 + 1);
                //System.out.println("Secret number is" + secretNumber);
                
                Scanner keyboard = new Scanner(System.in);
                    int guess;
                 do {
                System.out.print("Enter a guess: ");
                guess= keyboard.nextInt();
                System.out.println("your guess is " +guess);
                
                if (guess == secretNumber)
                         System.out.println("your guess is correct. Congratulations!");
                         else if (guess < secretNumber)
                            System.out.println("your guess is smaller than secret number");
                            else if(guess > secretNumber)
                                System.out.println("your guess is greater than the secret number"); 
                            } while (guess != secretNumber);
            
     }
    
}
