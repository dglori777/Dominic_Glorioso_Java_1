package s01_basic.ex01_printing;

public class PrintBoolean
{
    public static void main(String[] args)
    {
        System.out.printf("Boolean true: %b%n", true);
        System.out.printf("Boolean false: %b%n", false);
        System.out.printf("5 > 3 %b%n", 5 > 3);
        System.out.printf("10 == 20: %b%n", 10 == 20);
        System.out.printf("0 != 0: %b%n", 0 != 0);
    }
}