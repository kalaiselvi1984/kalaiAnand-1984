//Import the Scanner class
import java.util.Scanner;
public class weekday
{
    //Main method
    public static void main(String[] args)
    {
        //creating an object named sc to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //Taking input from the user
        int weekday = sc.nextInt();
        //The logic is built assuming that the first day of the week is Monday
        //check whether the user have given the input as 1, if so, print the corresponding weekday
        if(weekday == 1)
        {
            System.out.println("Monday");
        }
        //check whether the user have given the input as 2, if so, print the corresponding weekday
        else if(weekday == 2)
        {
            System.out.println("Tuesday");
        }
        //check whether the user have given the input as 3, if so, print the corresponding weekday
        else if(weekday == 3)
        {
            System.out.println("Wednesday");
        }
        //check whether the user have given the input as 4, if so, print the corresponding weekday
        else if(weekday == 4)
        {
            System.out.println("Thursday");
        }
        //check whether the user have given the input as 5, if so, print the corresponding weekday
        else if(weekday == 5)
        {
            System.out.println("Friday");
        }
        //check whether the user have given the input as 6, if so, print the corresponding weekday
        else if(weekday == 6)
        {
            System.out.println("Saturday");
        }
        //check whether the user have given the input as 7, if so, print the corresponding weekday
        else if(weekday == 7)
        {
            System.out.println("Sunday");
        }
        //check whether the user have given the input as 8, if so, print the corresponding weekday
        else
        {
            System.out.println("Please Enter a Valid Weekday");
        }
    }
}