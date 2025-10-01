package Scanners;

import java.util.Scanner;

public class AgeFuture
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = input.nextInt();
        int futureAge = age + 5;
        System.out.println("In 5 years, you will be " + futureAge + " years old.");

    }
}
