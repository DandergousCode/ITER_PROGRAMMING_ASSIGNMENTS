// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Rock, scissor, paper game.
import java.util.Scanner;

public class Assignment_14_Scissor_rock_paper_game 
{
    public static void main(String[] args) 
    {
        try(Scanner input = new Scanner(System.in);)
        {
            int computer = (int)(Math.random()*3);
            System.out.println("Scissor(0), Rock(1), Paper(2): ");
            int player = input.nextInt();

            System.out.println(">>Computer's turn: ");
            switch (computer) 
            {
                case 0:
                    System.out.println("Scissor.");
                    break;
                case 1:
                    System.out.println("Rock");
                    break;
                case 2:
                    System.out.println("Paper");
                    break;
            }

            System.out.println(">>Your's turn: ");
            switch (player) 
            {
                case 0:
                    System.out.println("Scissor");
                    break;
                case 1:
                    System.out.println("Rock");
                    break;
                case 2:
                    System.out.println("Paper");
                    break;
            }


            if(computer==player)
            {
                System.out.println(" too. It is a draw.");
            }
            else
            {
                boolean win = (player==0 && computer==2) || (player==1 && computer==0) || (player==2 && computer==1);
                if(win)
                {
                    System.out.println(". You won!");
                }
                else
                {
                    System.out.println(". You lose!");
                }
            }
        }
        
    }
    
}