package fc25_IfElse;

public class Ex06_LargestNumber
{
    public static void main(String[] args)
    {
        int a = 4;
        int b = 2;
        int c = 3;
        System.out.println("a is " + a + ", b is " + b + ", c is " + c);

        if (a == b || b == c || a == c) {
            System.out.println("Two or more numbers are equal");
        } else {
            System.out.println("The highest number is " + Math.max(a, Math.max(b, c)));
        }
    }
}
