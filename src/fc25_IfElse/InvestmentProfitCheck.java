package fc25_IfElse;

public class InvestmentProfitCheck
{
    public static void main(String[] args)
    {
        double assets = 75.75;
        double liabilities = 25;
        double equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        if (equity > 50) {
            System.out.println("Investment is profitable");
        } else {
            System.out.println("Investment is not profitable");
        }

        if (assets > liabilities) {
            System.out.println("Assets exceed Liabilities");
        } else if (assets == liabilities) {
            System.out.println("Assets equal Liabilities");
        } else {
            System.out.println("Assets do not exceed Liabilities");
        }
    }
}
