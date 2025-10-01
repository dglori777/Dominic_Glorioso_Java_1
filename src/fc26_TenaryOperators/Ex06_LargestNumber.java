package fc26_TenaryOperators;

public class Ex06_LargestNumber
{
    public static void main(String[] args)
    {
        int x = 10, y = 20, z = 15;

        String result = (x > y && x > z) ? "x is largest" : (y > z ? "y is largest" : "z is largest");

        System.out.println(result);
    }
}
