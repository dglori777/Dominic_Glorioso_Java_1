package fc26_TenaryOperators;

public class Ex10_TemperatureCheck
{
    public static void main(String[] args)
    {
        int temp = 30;

        String result = (temp > 35) ? "It's hot" : (temp >= 25 ? "It's warm" : "It's cold");

        System.out.println(result);
    }
}
