package s01_basic.ex03_variables;

public class CastingSafe
{
    public static void main(String[] args)
    {
        int bigNumber = 130;
        byte tiny = (byte) bigNumber;
        System.out.println("tiny =" + tiny);

        int a = 2_000_000_000;
        int b = 200_000_000;
        int c = a + b;
        System.out.println(c);
        long l = 9000000000L;
        int i = (int) l;
        System.out.println(i);
    }
}
