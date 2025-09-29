package fc17b_LargeNumbers;

public class EquationExampleSmall
{
    public static void main(String[] args)
    {
        float assetsValue = 750_000.5f;
        short liabilitiesAmount = 20;
        float equity_total = assetsValue - liabilitiesAmount;
        System.out.println("Assets = Liabilities + Equity");
        System.out.println(assetsValue + " = " + liabilitiesAmount + " + " + equity_total);
    }
}
