public class Runner {
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }
    public static int factorial(int num)
    {
        int returning = 1;
        for(int i = 1; i <= num; i++ )
        {
            returning *= i;
        }
        return returning;
    }
}
