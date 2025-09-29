package s01_basic.ex02_formating;

public class NextDayBonus
{
    public static void main(String[] args)
    {
        System.out.printf("| %8d | | %8s | | %8.1f | \n", 1234, "Java", 5.63);
        System.out.printf("| %-8d | | %-8s | | %-8.1f | \n", 1234, "Java", 5.63);
        System.out.printf("| %-20s | | %-8s | | %4s |%n", "CATEGORY", "NAME", "BITS");
    }
}
