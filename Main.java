import java.util.*;

class Total implements Addition
{
    @Override
    public int addNumbers(int low, int high) {
        int sum = 0;
        for(int i= low; i<=high; i++)
        {
            sum +=i;
        }
        return sum;
    }
}
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

        Total add = new Total();
        System.out.println("Sum of Numbers Between: " + add.addNumbers(low,upp));



    }
}
