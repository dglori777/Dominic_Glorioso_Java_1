package fc26_TenaryOperators;

public class Ex07_VowelCheck
{
    public static void main(String[] args)
    {
        char ch = 'a';

        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Not a vowel";

        System.out.println(result);
    }
}
