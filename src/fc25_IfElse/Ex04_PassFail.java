package fc25_IfElse;

public class Ex04_PassFail
{
    public static void main(String[] args)
    {
        int marks = 40;
        System.out.println("You scored " + marks);

        if (marks >= 90) {
            System.out.println("Excellent!");
        } else if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
