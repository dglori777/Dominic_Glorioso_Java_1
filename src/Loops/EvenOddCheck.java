package Loops;

public class EvenOddCheck
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 20; i++) {
            String type = (i % 2 == 0) ? "even" : "odd";
            System.out.println(i + " is " + type);
        }
    }
}
