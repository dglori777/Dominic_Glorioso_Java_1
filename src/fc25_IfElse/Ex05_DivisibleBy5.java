package fc25_IfElse;

public class Ex05_DivisibleBy5
{
    public static void main(String[] args) {
        int number = 99;
        System.out.println("The number is " + number);

        if (number % 10 == 0 && number % 5 == 0) {
            System.out.println("The number is divisible by both 5 and 10");
        }else if (number % 5 == 0) {
            System.out.println("The number is divisible by 5");
        }else {
            System.out.println("The number is not divisible by 5 or 10");
        }
    }
}
