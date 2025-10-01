package Scanners;

import java.util.Scanner;

public class RectangleArea
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = input.nextDouble();

        System.out.println("Enter height: ");
        double height = input.nextDouble();

        double area = width * height;

        System.out.println("The area of the rectangle is " + area);
    }
}
