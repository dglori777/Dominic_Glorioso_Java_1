package fc18_StringMethods;

public class Ex15Trim
{
    public static void main(String[] args)
    {
        String text = "   padded text   ";
        System.out.println("Before: '" + text + "'");
        String trimmed = text.trim();
        System.out.println("Afer: '" + trimmed + "'");
    }
}
