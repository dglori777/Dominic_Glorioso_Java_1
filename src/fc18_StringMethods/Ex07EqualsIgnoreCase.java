package fc18_StringMethods;

public class Ex07EqualsIgnoreCase
{
    public static void main(String[] args)
    {
        String a = "Java";
        String b = "java";
        boolean result = a.equalsIgnoreCase(b);
        System.out.println(result);
    }
}
