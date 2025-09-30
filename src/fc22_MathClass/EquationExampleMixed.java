package fc22_MathClass;

public class EquationExampleMixed
{
    public static void main(String[] args)
    {
        double assets = 75.75;
        int liabilities = 25;
        double equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        System.out.println("Absolute of -equity: " + Math.abs(-equity));
        System.out.println("Max of assets and liabilities: " + Math.max(assets, liabilities));
        System.out.println("Liabilities^2: " + Math.pow(liabilities, 2));

        float assetFloat = 80.3f;
        int roundedAsset = Math.round(assetFloat);
        System.out.println("Rounded asset: " + roundedAsset);

        System.out.println("PI: " + Math.PI);
        int randomValue = (int)(Math.random() * 100);
        System.out.println("Random value (0-99): " + randomValue);
    }
}
