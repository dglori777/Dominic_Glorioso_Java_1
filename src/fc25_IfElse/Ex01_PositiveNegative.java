package fc25_IfElse;

public class Ex01_PositiveNegative
{
    public static void main(String[] args)
    {
        int number = -98;
        System.out.println("The number is " + number);

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is 0");
        }
    }
}
