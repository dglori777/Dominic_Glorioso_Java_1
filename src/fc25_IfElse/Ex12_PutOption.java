package fc25_IfElse;

public class Ex12_PutOption
{
    public static void main(String[] args)
    {
        double stockPrice = 80;
        double strikePrice = 100;
        if (stockPrice < strikePrice) {
            System.out.println("Put option is profitable!");
        } else {
            System.out.println("Put option is not profitable yet.");
        }
    }
}
