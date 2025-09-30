package fc25_IfElse;

public class Ex13_StockTrend
{
    public static void main(String[] args)
    {
        String trend = "up";

        if (trend.equals("up")) {
            System.out.println("Consider buying a Call option.");
        } else if (trend.equals("down")) {
            System.out.println("Consider buying a Put option");
        } else {
            System.out.println("Hold the stock for now.");
        }
    }
}
