package s01_basic.ex02_formating;

public class FormatSpecifierDemo
{
    public static void main(String[] args)
    {
        char letter= 'A';
        boolean flag= true;
        int number= 42;
        double price= 123.456;
        String name= "Alice";
        System.out.println("=== Example 1: Without Width/Precision ===");
        System.out.printf("Char: %c\n", letter);
        System.out.printf("Boolean: %b\n", flag);
        System.out.printf("Integer: %d\n", number);
        System.out.printf("Decimal: %f\n", price);
        System.out.printf("String: %s\n", name);
        System.out.println("\n=== Example 2: With Width/Precision ===");
        System.out.printf("Char: %5c\n", letter);
        System.out.printf("Boolean: %6b\n", flag);
        System.out.printf("Integer: %5d\n", number);
        System.out.printf("Decimal: %10.2f\n", price);
        System.out.printf("String: %12s\n", name);
        System.out.println("\n=== Example 3: With Alignment (Left Aligned) ===");
        System.out.printf("Char: %-5c|\n", letter);
        System.out.printf("Boolean: %-6b|\n", flag);
        System.out.printf("Integer: %-5d|\n", number);
        System.out.printf("Decimal: %-10.2f|\n", price);
        System.out.printf("String: %-12s|\n", name);
    }
}
