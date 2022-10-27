import java.util.Scanner;
public class Hirt_Jared_Q2 {
    public static void main(String[] args)
    {
        //Declaring Variables
        int storedNumber1;
        int storedNumber2;
        int storedNumber3;
        int firstNumber;
        int secondNumber;

        int count = 2;

        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter the first number for the necklace");
        firstNumber = kbd.nextInt();
        System.out.println("Please enter the second number for the necklace");
        secondNumber = kbd.nextInt();
        storedNumber1 = necklace(firstNumber, secondNumber);
        storedNumber2 = necklace(secondNumber, storedNumber1);
        System.out.printf("%d %d %d %d ",firstNumber, secondNumber, storedNumber1, storedNumber2);
        while(!(storedNumber1 == firstNumber && storedNumber2 == secondNumber))
        {
            count += 1;
            storedNumber3 = storedNumber1;
            storedNumber1 = storedNumber2;
            storedNumber2 = necklace(storedNumber3, storedNumber2);
            System.out.print("" + storedNumber2 + " ");
        }
        System.out.printf("%nThis took %d steps", count);
    }
    public static int necklace(int a, int b)
    {
        return (a + b)%10;
    }
}

/**
 * OUTPUT
 Please enter the first number for the necklace
 1
 Please enter the second number for the necklace
 8
 1 8 9 7 6 3 9 2 1 3 4 7 1 8
 This took 12 steps
 Process finished with exit code 0

 */