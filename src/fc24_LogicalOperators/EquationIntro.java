package fc24_LogicalOperators;

public class EquationIntro
{
    public static void main(String[] args)
    {
        int assets = 100;
        int liabilities = 40;
        int equity = assets - liabilities;

        System.out.println("Accounting Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);

        boolean assetsGreater = assets > liabilities;
        boolean equityEquals60 = equity == 60;
        boolean liabilitiesLess50 = liabilities < 50;

        boolean andResult = assetsGreater && equityEquals60;
        System.out.println("Assets>Liabilities AND Equity==60: " + andResult);

        boolean orResult = equityEquals60 || liabilitiesLess50;
        System.out.println("Equity==60 OR Liabilities<50: " + orResult);

        boolean notResult = !equityEquals60;
        System.out.println("NOT Equity==60: " + notResult);
    }
}
