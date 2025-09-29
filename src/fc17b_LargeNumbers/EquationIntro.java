package fc17b_LargeNumbers;

public class EquationIntro
{
    public static void main(String[] args)
    {
        long assetsValue = 1_000_000L;
        double liabilitiesAmount = 500_000.5;
        double equity_total = assetsValue - liabilitiesAmount;
        System.out.println("Assets = Liabilities + Equity");
        System.out.println(assetsValue + " = " + liabilitiesAmount + " + " + equity_total);
    }
}
