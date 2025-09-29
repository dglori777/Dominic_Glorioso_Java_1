package fc14_PrimitiveDataTypes.ex01_one;

public class EquationExampleSmall
{
    public static void main(String[] args)
    {
        float assets = 50.5f;
        short liabilities = 20;
        float equity = assets - liabilities;
        System.out.println("Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);
    }
}
