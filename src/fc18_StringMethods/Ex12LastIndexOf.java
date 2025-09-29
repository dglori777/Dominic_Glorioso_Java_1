package fc18_StringMethods;

public class Ex12LastIndexOf
{
    public static void main(String[] args)
    {
        String text = "abracadabra";
        int lastChar = text.lastIndexOf('a');
        int lastSub = text.lastIndexOf("bra");
        System.out.println("Last index of 'a': " + lastChar);
        System.out.println("Last index of \"bra\": " + lastSub);
    }
}
