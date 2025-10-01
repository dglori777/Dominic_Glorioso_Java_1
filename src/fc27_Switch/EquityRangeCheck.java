package fc27_Switch;

public class EquityRangeCheck
{
    public static void main(String[] args)
    {
        int equity = 75;

        System.out.println("Equity Value" + equity);

        String status;
        switch (equity / 25) {
            case 0:
                status = "Very Low Equity";
                break;
            case 1:
                status = "Low Equity";
                break;
            case 2:
                status = "Moderate Equity";
                break;
            case 3:
                status = "High Equity";
                break;
            default:
                status = "Very High Equity";
                break;
        }
        System.out.println("Equity Status: " + status);
    }
}
