package fc25_IfElse;

public class Ex08_VotingEligibility
{
    public static void main(String[] args)
    {
        int age = -1;
        System.out.println("The voter is " + age);

        if (age >= 18) {
            System.out.println("They can vote!");
        } else if (age < 0) {
            System.out.println("They are not born yet! How could they vote?");
        } else {
            System.out.println("They are not old enough to vote.");
        }
    }
}
