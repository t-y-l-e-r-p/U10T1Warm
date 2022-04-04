public class Runner {
    public static void main(String[] args)
    {
        System.out.println(simpleRecursiveDivision(8));
        System.out.println(sum(6));  // should print 21
        System.out.println(sum(10)); // should print 55


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
    public static void simpleRecursion(int n)
    {
        System.out.println("Called, n = " + n);
        if (n > 2)
        {
            simpleRecursion(n - 1);
        }
        System.out.println("Ended, n = " + n);
    }
    public static int simpleRecursiveDivision(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        return num + simpleRecursiveDivision(num / 2);
    }
    public static int sum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return(n += sum(n-1));
        }
    }



}
