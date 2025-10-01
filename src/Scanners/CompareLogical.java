package Scanners;

public class CompareLogical
{
    public static void main(String[] args)
    {
        int x = 10, y = 20;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x < y && x > 5: " + (x < y && x > 5));
        System.out.println("x < 0 || y > 15: " + (x < 0 || y > 15));
        System.out.println("!(x > y): " + !(x > y));
    }
}
