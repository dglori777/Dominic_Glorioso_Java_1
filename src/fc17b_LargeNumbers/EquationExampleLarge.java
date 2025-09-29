package fc17b_LargeNumbers;

public class EquationExampleLarge
{
    public static void main(String[] args)
    {
        long totalAssets = 10_000_000L;
        byte liabilitiesAmount = 50;
        long equity_total = totalAssets - liabilitiesAmount;
        System.out.println("Assets = Liabilities + Equity");
        System.out.println(totalAssets + " = " + liabilitiesAmount + " + " + equity_total);
    }
}
