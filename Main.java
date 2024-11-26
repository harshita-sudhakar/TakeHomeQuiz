import java.util.*;

public class Main
{
    public static void main(String [] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in Two Numbers");
        System.out.print("Lower Bound: ");
        int low = reader.nextInt();
        System.out.print("Upper Bound: ");
        int upp = reader.nextInt();

        Addition add = (int lower, int higher) ->
        {
            int sum = 0;
            for(int i= lower; i<=higher; i++)
            {
                sum +=i;
            }
            return sum;
        };

        System.out.println("Sum of Numbers Between: " + add.addNumbers(low,upp));



    }
}
