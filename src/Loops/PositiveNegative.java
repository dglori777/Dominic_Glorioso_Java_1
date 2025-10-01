package Loops;

public class PositiveNegative
{
    public static void main(String[] args)
    {
        int n1 = -2, n2 = 3, n3 = -1, n4 = 5, n5 = 0;

        for (int i = 1; i <=5; i++) {
            int num = (i == 1) ? n1 : (i == 2) ? n2 : (i == 3) ? n3 : (i == 4) ? n4 : n5;
            if (num > 0) {
                System.out.println(num + " is positive");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else  {
                System.out.println(num + " is zero");
            }
        }
    }
}
