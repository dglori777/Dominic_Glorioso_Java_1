package fc22_MathClass;

public class EquationExampleLarge
{
    public static void main(String[] args)
    {
        long assets = 200L;
        byte liabilities = 50;
        long equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);

        System.out.println("Absolute equity: " + Math.abs(equity));
        System.out.println("Max of assets and equity: " + Math.max(assets, equity));
        System.out.println("Assets^3: " + Math.pow(assets, 3));

        float assetFloat = 210.9f;
        int roundedAsset = Math.round(assetFloat);
        System.out.println("Rounded asset value: " + roundedAsset);

        System.out.println("PI: " + Math.PI);
        int randomValue = (int)(Math.random() * 200);
        System.out.println("Random value (0-199): " + randomValue);
    }
}
