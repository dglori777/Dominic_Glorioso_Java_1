package fc25_IfElse;

public class Ex07_VowelCheck
{
    public static void main(String[] args)
    {
        char ch = 'A';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not a vowel");
        }
    }
}
