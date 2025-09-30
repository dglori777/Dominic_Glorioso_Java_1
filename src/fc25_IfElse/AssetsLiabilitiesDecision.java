package fc25_IfElse;

public class AssetsLiabilitiesDecision
{
    public static void main(String[] args)
    {
        int assets = 100;
        int liabilities = 40;
        int equity = assets - liabilities;

        System.out.println("Accounting Equation: " + assets + " = " + liabilities + " + " + equity);

        if (assets > liabilities) {
            System.out.println("Assets are greater than Liabilities");
        } else {
            System.out.println("Assets are not greater than Liabilities");
        }
        if (equity > 0) {
            System.out.println("Equity is positive");
        } else {
            System.out.println("Equity is negative");
        }
    }
}
