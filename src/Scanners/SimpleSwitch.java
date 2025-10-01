package Scanners;

import java.util.Scanner;

public class SimpleSwitch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick 21 for arithmetic demo: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 21:
                System.out.println("Arithmetic demo coming up!");
                break;
            case 20:
                System.out.println("Why did you type 20?");
            default:
                System.out.println("Try 21 next time.");
        }
    }
}
