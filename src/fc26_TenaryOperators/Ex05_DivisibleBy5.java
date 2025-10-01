package fc26_TenaryOperators;

public class Ex05_DivisibleBy5
{
    public static void main(String[] args)
    {
        int num = 25;

        String result = (num % 5 == 0) ? "Divisible by 5" : "Not divisible by 5";

        System.out.println(result);
    }
}
