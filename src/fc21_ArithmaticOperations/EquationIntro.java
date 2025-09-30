package fc21_ArithmaticOperations;

public class EquationIntro
{
    public static void main(String[] args)
    {
        int assets = 100;
        int liabilites = 40;
        int equity = assets - liabilites;

        System.out.println("Accounting Equation: Assets = Liabilities + Equity");
        System.out.println(assets + " = " + liabilites + " + " + equity);
        System.out.println("Arithmatic Operations Examples:");
        System.out.println("Addition: " + assets + " + " + liabilites + " = " + (assets + liabilites));
        System.out.println("Subtraction: " + assets + " - " + liabilites + " = " + (assets - liabilites));
        System.out.println("Multiplication: " + assets + " * 2 = " + (assets * 2));
        System.out.println("Division: " + assets + " / 4 = " + (assets / 4));
        System.out.println("Modulus: " + assets + " % 3 = " + (assets % 3));
        System.out.println("Operator Precedence: " + assets + " + " + liabilites + " * 2 =" +
                (assets + liabilites * 2));
    }
}
