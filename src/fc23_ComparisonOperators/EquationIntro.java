package fc23_ComparisonOperators;

public class EquationIntro
{
    public static void main(String[] args)
    {
        int assets = 100;
        int liabilities = 40;
        int equity = assets - liabilities;

        System.out.println("Accounting Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);

        boolean isAssetsGreater = assets > liabilities;
        boolean isLiabilitiesLess = liabilities < assets;
        boolean isEqual = equity == 60;
        boolean isAssetsGreaterOrEqual = assets >= 100;
        boolean isLiabilitiesLessOrEqual = liabilities <= 40;
        boolean isNotEqual = equity != 50;

        System.out.println("Is Assets > Liabilities? " + isAssetsGreater);
        System.out.println("Is Liabilities < Assets? " + isLiabilitiesLess);
        System.out.println("Is Equity == 60? " + isEqual);
        System.out.println("Is Assets >= 100? " + isAssetsGreaterOrEqual);
        System.out.println("Is Liabilities <= 40? " + isLiabilitiesLessOrEqual);
        System.out.println("Is Equity != 50? " + isNotEqual);
    }
}
