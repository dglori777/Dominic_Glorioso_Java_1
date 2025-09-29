package s01_basic.ex02_formating;

public class IntegerSimple
{
    public static void main(String[] args)
    {
        System.out.printf("Number: %d%n", 42);
        System.out.printf("Number: %5d%n", 42);
        System.out.printf("Number: %5d%n", 12345);
        System.out.printf("Number: %-5dEND%n", 42);
        System.out.printf("Number: %8d%n", 42);
    }
}
