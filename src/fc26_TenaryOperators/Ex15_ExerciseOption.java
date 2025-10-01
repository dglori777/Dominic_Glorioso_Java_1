package fc26_TenaryOperators;

public class Ex15_ExerciseOption
{
    public static void main(String[] args)
    {
        double stockPrice = 105;
        double strikePrice = 100;
        String optionType = "call";
        double premium = 5;

        switch (optionType) {
            case "call": {
                double intrinsicValue = Math.max(0, stockPrice - strikePrice);
                double profit = intrinsicValue - premium;

                String decision = (intrinsicValue > 0)
                        ? "Exercise your Call option!"
                        : (stockPrice == strikePrice)
                        ? "Option is at the money"
                        : "Do not exercise the option.";

                System.out.println(decision);
                System.out.println("Intrinsic Value = " + intrinsicValue);
                System.out.println("Profit after premium = " + profit);

                double breakEven = strikePrice + premium;

                System.out.println("Break-even stock price = " + breakEven);
                System.out.println("Profit squared (Math.pow) = " + Math.pow(profit, 2));
                System.out.println("Absolute profit (Math.abs) = " + Math.abs(profit));
                System.out.println("Square root of strike price = " + Math.sqrt(strikePrice));
                break;
            }
            case "put": {
                double intrinsicValue = Math.max(0, strikePrice - stockPrice);
                double profit = intrinsicValue - premium;

                String decision = (intrinsicValue > 0)
                        ? "Exercise your Put option!"
                        : (stockPrice == strikePrice)
                        ? "Option is at the money"
                        : "Do not exercise the option.";

                System.out.println(decision);
                System.out.println("Intrinsic Value = " + intrinsicValue);
                System.out.println("Profit after premium = " + profit);

                double breakEven = strikePrice - premium;

                System.out.println("Break-even stock price = " + breakEven);
                System.out.println("Profit squared (Math.pow) = " + Math.pow(profit, 2));
                System.out.println("Absolute profit (Math.abs) = " + Math.abs(profit));
                System.out.println("Square root of strike price = " + Math.sqrt(strikePrice));
                break;
            }
                default:
                    System.out.println("Invalid option type! Must be 'call' or 'put'.");
                    break;

        }
    }
}
