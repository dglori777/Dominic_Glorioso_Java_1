package fc25_IfElse;

public class Ex12_PutOption
{
    public static void main(String[] args)
    {
        double stockPrice = 95;
        double strikePrice = 100;
        if (stockPrice < strikePrice) {
            System.out.println("Put option is profitable!");
        } else if (stockPrice == strikePrice) {
            System.out.println("Put option is at the money");
        } else {
            System.out.println("Put option is out of the money");
        }
    }
}
