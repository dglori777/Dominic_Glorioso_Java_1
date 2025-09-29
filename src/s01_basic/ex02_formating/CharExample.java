package s01_basic.ex02_formating;

public class CharExample
{
    public static void main(String[] args)
    {
        char ch = 'a';
        System.out.printf("The letter is %c%n", ch);
        char fromCode= (char)65;
        System.out.printf("Char for 65 is %c%n", fromCode);
    }
}