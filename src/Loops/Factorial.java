package Loops;

public class Factorial
{
    public static void main(String[] args)
    {
        int factorial = 1;

        for (int i = 1; i <= 7; i++) {
            factorial *= i;
        }
        System.out.println("5!  = " + factorial);
    }
}
