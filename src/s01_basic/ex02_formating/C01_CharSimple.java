package s01_basic.ex02_formating;

public class C01_CharSimple
{
    public static void main(String[] args)
    {
        System.out.printf("Letter: %c%n", 'A');
        System.out.printf("Letter: %15c%n", 'A');
        System.out.printf("Letter: %-15cEnd%n", 'A');
    }
}