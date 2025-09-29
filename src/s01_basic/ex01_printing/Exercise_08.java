package s01_basic.ex01_printing;

public class Exercise_08
{
    public static void main(String[] args) {
        float pi = 3.14159F;
        float radius = 5.5F;
        float perimeter = 2 * radius * pi;
        float area = radius * radius * pi;
        System.out.println("radius = 5.5");
        System.out.println("pi = 3.14159");
        System.out.println("perimeter= 2 * radius * pi");
        System.out.println("area= radius^2 * pi");
        System.out.println("perimeter= " + perimeter);
        System.out.println("area= " + area);
    }
}