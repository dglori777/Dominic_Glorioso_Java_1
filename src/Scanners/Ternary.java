package Scanners;

public class Ternary
{
    public static void main(String[] args)
    {
        int age = 17;
        String canVote = (age >= 18) ? "You can vote" : "Too young to vote";
        System.out.println(canVote);

        int marks = 85;
        String grade = (marks >= 90) ? "A" : (marks >= 80) ? "B" : "C or lower";
        System.out.println("Grade: " + grade);
    }
}
