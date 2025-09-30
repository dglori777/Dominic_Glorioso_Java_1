package fc22_MathClass;

public class EquationIntro
{
    public static void main(String[] args)
    {
         int assets = 100;
         int liabilities = 40;
         int equity = assets - liabilities;

        System.out.println("Accounting Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);
        System.out.println("Absolute value of -equity: " + Math.abs(-equity));
        System.out.println("Maximum of assets and liabilities: " + Math.max(assets, liabilities));
        System.out.println("Assets to the power of 2: " + Math.pow(assets, 2));

        float assetFloat = 123.75f;
        int roundedAsset = Math.round(assetFloat);

        System.out.println("Rounded asset value: " + roundedAsset);

        System.out.println("Value of PI: " + Math.PI);
        int randomValue = (int)(Math.random() * 100);
        System.out.println("Random value (0-99): " + randomValue);
 }
}
