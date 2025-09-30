package fc25_IfElse;

public class Ex03_CompareNumbers
{
    public static void main(String[] args)
    {
        int a = 8;
        int b = 10;
        System.out.println("a is " + a + " and b is " + b);

        if (a == b) {
            System.out.println("a equals b");
        } else if (a <= b) {
            System.out.println("a is less than or equal to b");
        } else {
            System.out.println("a is greater than b");
        }
    }
}
