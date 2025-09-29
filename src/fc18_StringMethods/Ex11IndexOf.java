package fc18_StringMethods;

public class Ex11IndexOf
{
    public static void main(String[] args)
    {
        String text = "banana";
        int indexChar = text.indexOf('a');
        int indexStr = text.indexOf("na");
        System.out.println("Index of a: " + indexChar);
        System.out.println("Index of \"na\": " + indexStr);
    }
}
