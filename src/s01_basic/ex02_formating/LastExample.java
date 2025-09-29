package s01_basic.ex02_formating;

public class LastExample
{
    public static void main(String[] args)
    {
        char letter= 'J';
        boolean switchOn= true;
        int age= 20;
        float price= 99.99f;
        String name= "Ringo";
        System.out.printf("Char: %c%n", letter);
        System.out.printf("Boolean: %b%n", switchOn);
        System.out.printf("Int: %d%n", age);
        System.out.printf("Float: %f%n", price);
        System.out.printf("String: %s%n", name);
    }
}