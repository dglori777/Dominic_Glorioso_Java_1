package fc26_TenaryOperators;

public class Ex09_Login
{
    public static void main(String[] args)
    {
        String username = "admin";
        String password = "1234";

        String result = (username.equals("admin") && password.equals("1234")) ? "Login successful" : "Login failed";

        System.out.println(result);
    }
}
