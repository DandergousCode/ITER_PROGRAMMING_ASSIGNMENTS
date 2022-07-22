// Name: Soumyadip Majumder
// Section: 11
// Regd.no: 2141013055
// Problem: Display today and number of days after today for a future day and display the future day of the week.
import java.util.Scanner;

public class Assignment_10_display_today_AND_numberOFdaysAfterToday_for_a_future_day_AND_display_the_future_day_of_TheWeek 
{
    public static void main(String[] args) 
    {
        try(Scanner input = new Scanner(System.in);)
        {
            int day;
            int dateInterval;
            System.out.println("Enter today's day: ");
            day = input.nextInt();
            System.out.println("Enter the number of days elapsed since today: ");
            dateInterval = input.nextInt();

            String today ="";
            switch (day) 
            {
                case 0: today = "Sunday";
                    break;
                case 1: today = "Monday";
                    break;
                case 2: today = "Tuesday";
                    break;
                case 3: today = "Wednesday";
                    break;
                case 4: today = "Thursday";
                    break;
                case 5: today = "Friday";
                    break;
                case 6: today = "Saturday";
                    break;
                default:
                    today = "Invalid day number";
            }


            String futureDay = "";
            switch ((day + dateInterval) % 7) 
            {
                case 0: futureDay = "Sunday";
                    break;
                case 1: futureDay = "Monday";
                    break;
                case 2: futureDay = "Tuesday";
                    break;
                case 3: futureDay = "Wednesday";
                    break;
                case 4: futureDay = "Thursday";
                    break;
                case 5: futureDay = "Friday";
                    break;
                case 6: futureDay = "Saturday";
                    break;
            }
            System.out.println("Today is " + today + " and the future day is " + futureDay);
        }
    }
    
}