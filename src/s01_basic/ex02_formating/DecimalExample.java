package s01_basic.ex02_formating;

public class DecimalExample
{
    public static void main(String[] args)
    {
        float price= 45.50f;
        System.out.printf("The price is %f%n", price);
        double pi= 3.1415926535;
        System.out.printf("Pi to 2 decimal places: %.2f%n", pi);
        float price1= 19.99f;
        float price2= 29.49f;
        System.out.printf("Price1: %f, Price2: %f%n", price1, price2);
    }
}
