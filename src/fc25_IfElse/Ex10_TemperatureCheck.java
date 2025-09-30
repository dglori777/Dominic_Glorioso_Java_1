package fc25_IfElse;

public class Ex10_TemperatureCheck
{
    public static void main(String[] args)
    {
        int temperature = 89;
        System.out.println("The temperature is " + temperature);

        if (temperature >= 75) {
            System.out.println("It is hot outside");
        } else if (temperature < 75 && temperature >= 60) {
            System.out.println("It is nice outside");
        } else if (temperature < 60 && temperature >= 32) {
            System.out.println("It is chilly outside");
        } else {
            System.out.println("It is below freezing outside!");
        }
    }
}
