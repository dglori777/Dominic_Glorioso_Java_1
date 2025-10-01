package Scanners;

import java.util.Scanner;

public class ReadNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number (20-27): ");
        int choice = sc.nextInt();
        String result = (choice == 22) ? "22?" : "Good choice";
        System.out.println(result);
        sc.close();
    }
}
