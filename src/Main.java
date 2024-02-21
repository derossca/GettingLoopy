//importing scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //declaring variables most not needed, just in case I could redo them
        Scanner in = new Scanner(System.in);
        int num = 0;
        String trash = "";
        boolean done = false;

        //TASK 1

        for(int r = 0; r < 31; r++) // for loop that increments 1 at a time up to 30
        {
            System.out.printf("%3d |", r); // will print 3 digits plus a | counting to 30
        }

        System.out.println("\n");

        //TASK 2

        for(int r = 30; r > -1; r--) // for loop that decrements by 1 counting down from 30
        {
            System.out.println("" + r);
        }

        System.out.println("\n");

        //TASK 3

        for(int r = 0; r < 19 ; r += 3) // for loop that increments by 3 up to 18 but less than 19
        {
            System.out.println("" + r);
        }

        System.out.println("\n");

        //TASK 4

        for(int r = 10; r > -1; r -= 2) // for loop that decrements by 2 from 10 to 0 but is greater than -1
        {
            System.out.println("" + r);
        }

        System.out.println("\n");

        //TASK 5

        
    }
}