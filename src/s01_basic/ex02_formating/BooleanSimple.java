package s01_basic.ex02_formating;

public class BooleanSimple
{
    public static void main(String[] args)
    {
        System.out.printf("Switch: %b%n", true);
        System.out.printf("Switch: %6b%n", true);
        System.out.printf("Switch: %6b%n", false);
        System.out.printf("Switch: %-6bEND%n", true);
        System.out.printf("Switch: %-6bEND%n", false);
        boolean flag= true;
        System.out.printf("%b\n", flag);
        System.out.printf("%6b\n", flag);
    }
}
