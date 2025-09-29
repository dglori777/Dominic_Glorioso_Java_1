package s01_basic.ex02_formating;

public class StringSimple
{
    public static void main(String[] args)
    {
        System.out.printf("Word: %s%n", "Java");
        System.out.printf("Word: %12s%n", "Java");
        System.out.printf("Word: %12s%n", "Programming");
        System.out.printf("Word: %-12sEND%n", "Java");
        String name= "Alice";
        System.out.printf("%s%n", name);
        System.out.printf("%12s%n", name);
    }
}
