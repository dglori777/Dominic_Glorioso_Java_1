package fc17_NamingVariables;

public class EquationExampleMixed
{
    public static void main(String[] args)
    {
        double assetsValue = 75.75;
        int liabilitiesAmount = 25;
        double equity_total = assetsValue - liabilitiesAmount;
        System.out.println("Assets = Liabilities + Equity");
        System.out.println(assetsValue + " = " + liabilitiesAmount + " + " + equity_total);
    }
}
