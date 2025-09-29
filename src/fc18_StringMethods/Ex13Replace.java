package fc18_StringMethods;

public class Ex13Replace
{
    public static void main(String[] args)
    {
        String text = "apple";
        String replacedChar = text.replace('p', 'b');
        String replacedSub = text.replace("pp", "zz");
        System.out.println(replacedChar);
        System.out.println(replacedSub);
    }
}
