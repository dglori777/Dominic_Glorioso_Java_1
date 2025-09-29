package fc17b_LargeNumbers;

public class EquationExampleMixed
{
    public static void main(String[] args)
    {
        double assetsValue = 7_500_000.75;
        int liabilitiesAmount = 2_500_000;
        double equity_total = assetsValue - liabilitiesAmount;
        System.out.println("Assets = Liabilities + Equity");
        System.out.println(assetsValue + " = " + liabilitiesAmount + " + " + equity_total);
    }
}
