package fc18_StringMethods;

public class Ex20Matches
{
    public static void main(String[] args)
    {
        String email = "user@example.com";
        boolean ok = email.matches("\\w+@\\w+\\.\\w+");
        System.out.println("Email matches basic pattern: " + ok);
    }
}
