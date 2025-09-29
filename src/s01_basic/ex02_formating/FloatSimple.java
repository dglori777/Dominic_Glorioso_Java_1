package s01_basic.ex02_formating;

public class FloatSimple
{
    public static void main(String[] args)
    {
        double  pi= 3.14159D;
        System.out.printf("Pi: %f%n", pi);
        System.out.printf("Pi: %10.2f%n", pi);
        double price= 12345.6789;
        System.out.printf("Price: %10.2f%n", price);
        double salary= 4567.5D;
        System.out.printf("Salary: %-10.2fEnd%n", salary);
    }
}
