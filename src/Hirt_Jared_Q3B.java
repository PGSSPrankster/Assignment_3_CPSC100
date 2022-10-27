public class Hirt_Jared_Q3B {
    public static void main(String[] args)
    {
        double principle = 10000.00d;
        double rate = 0.05d;
        int years = 5;
        for(int i = 0;i<= years;i++)
            System.out.printf("After %d years you would have $%.2f%n",i,interest(principle, rate, i));
    }
    public static double interest(double principle, double rate, int years)
    {
        double finalRate = 1;
        for(int i = 1; i <= years; i++)
            finalRate = finalRate * (1 + rate);
        return principle*finalRate;
    }
}
