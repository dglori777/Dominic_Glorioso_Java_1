package fc25_IfElse;

public class Ex14_TargetProfit
{
    public static void main(String[] args)
    {
        double profit = 50;
        double target = 100;

        if (profit >= target * 2) {
            System.out.println("Huge success! Profit doubled your target!");
        } else if (profit >= target && profit > 0) {
            System.out.println("Small profit, keep pushing!");
        } else {
            System.out.println("Loss occurred, reconsider your strategy.");
        }
    }
}
