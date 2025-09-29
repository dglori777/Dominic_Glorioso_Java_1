package fc18_StringMethods;

public class Ex14ReplaceAll
{
    public static void main(String[] args)
    {
        String text = "user123, id456, code789";
        String result = text.replaceAll("\\d+", "X");
        System.out.println(result);
    }
}
