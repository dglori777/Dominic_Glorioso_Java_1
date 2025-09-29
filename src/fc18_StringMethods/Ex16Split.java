package fc18_StringMethods;

import java.util.Arrays;

public class Ex16Split
{
    public static void main(String[] args)
    {
        String csv = "red,green,blue";
        String[] parts = csv.split(",");
        System.out.println(Arrays.toString(parts));
        String[] twoParts = csv.split(",", 2);
        System.out.println(Arrays.toString(twoParts));
    }
}
