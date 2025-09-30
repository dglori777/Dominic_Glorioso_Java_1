package fc25_IfElse;

public class Ex15_ExerciseOption
{
    public static void main(String[] args)
    {
        double stockPrice = 105;
        double strickPrice = 100;
        String optionType = "call";

        if (optionType.equals("call") && stockPrice > strickPrice) {
            System.out.println("Exercise your Call option!");
        } else if (optionType.equals("put") && stockPrice < strickPrice) {
            System.out.println("Exercise your Put option!");
        } else {
            System.out.println("Do not exercise the option.");
        }
    }
}
