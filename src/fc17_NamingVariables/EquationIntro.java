package fc17_NamingVariables;

public class EquationIntro
{
    public static void main(String[] args)
    {
        int assetsValue = 100;
        double liabilitiesAmount = 40.5;
        double equity_total = assetsValue - liabilitiesAmount;
        System.out.println("Assets = Liabilities + Equity");
        System.out.println(assetsValue + " = " + liabilitiesAmount + " + " + equity_total);
    }
}
