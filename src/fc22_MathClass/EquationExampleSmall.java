package fc22_MathClass;

public class EquationExampleSmall
{
    public static void main(String[] args)
    {
        int assets = 50;
        int liabilities = 20;
        int equity = assets - liabilities;

        System.out.println("Equation: " + assets + " = " + liabilities + " + " + equity);
        System.out.println("Absolute value of -liabilities: " + Math.abs(-liabilities));
        System.out.println("Max of equity and liabilities: " + Math.max(equity, liabilities));
        System.out.println("Liabilities squared: " + Math.pow(liabilities, 2));

        float assetFloat = 55.6f;
        int roundedAsset = Math.round(assetFloat);
        System.out.println("Rounded asset value: " + roundedAsset);

        System.out.println("PI value: " + Math.PI);
        int randomValue = (int)(Math.random() * 50);
        System.out.println("Random value (0-49): " + randomValue);
    }
}
