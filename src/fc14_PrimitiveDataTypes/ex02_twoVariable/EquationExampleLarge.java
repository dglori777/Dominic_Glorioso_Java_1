package fc14_PrimitiveDataTypes.ex02_twoVariable;

public class EquationExampleLarge
{
    public static void main(String[] args)
    {
        long assets = 200L;
        byte liabilities = 50;
        long equity = assets - liabilities;
        System.out.println("Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilities + " + " + equity);    }
}
