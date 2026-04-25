package pgm1;

public class Result
{
    public static String display(int m)
    {
        if(m < 0 || m > 100)
            return "invalid";
        else if(m < 40)
            return "fail";
        else
            return "pass";
    }
    public static void main(String[] args)
    {
        System.out.println(display(55));
    }
}