package fc18_StringMethods;

public class Ex17Concat
{
    public static void main(String[] args)
    {
        String a = "Hello";
        String b = "World";
        String result = a.concat(" ").concat(b);
        System.out.println(result);
        System.out.println(a + " " + b);
    }
}
