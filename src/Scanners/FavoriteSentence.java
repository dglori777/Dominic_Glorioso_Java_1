package Scanners;

import java.util.Scanner;

public class FavoriteSentence
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String sentence = input.nextLine();

        System.out.println("How old are you?");
        String sentence2 = input.nextLine();

        System.out.println("You are the youngest person ever!");
    }
}
