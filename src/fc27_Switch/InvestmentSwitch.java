package fc27_Switch;

public class InvestmentSwitch
{
    public static void main(String[] args)
    {
        int investment = 75;

        System.out.println("Investment Amount: " + investment);

        String evaluation;
        switch (investment / 25) {
            case 0:
                evaluation = "Very Small Investment";
                break;
            case 1:
                evaluation = "Small Investment";
                break;
            case 2:
                evaluation = "Moderate Investment";
                break;
            case 3:
                evaluation = "Large Investment";
                break;
            default:
                evaluation = "Very Large Investment";
                break;
        }
        System.out.println("Investment Evaluation: " + evaluation);
    }
}
