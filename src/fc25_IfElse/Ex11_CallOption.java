package fc25_IfElse;

public class Ex11_CallOption
{
    public static void main(String[] args)
    {
        double stockPrice = 120;
        double strikePrice = 100;

        if (stockPrice > strikePrice) {
            System.out.println("Call option is profitable!");
        } else {
            System.out.println("Call option is not profitable yet.");
        }
    }
}
