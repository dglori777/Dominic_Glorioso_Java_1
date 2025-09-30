package fc25_IfElse;

public class Ex02_EvenOdd
{
    public static void main(String[] args)
    {
        int number = 45556;
        System.out.println("The number is " + number);

        if (number == 0) {
            System.out.println("Number is 0");
        } else if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
