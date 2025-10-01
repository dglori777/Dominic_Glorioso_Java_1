package Loops;

public class PrintOdd
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " is divisible by 5");
            }
        }
    }
}
