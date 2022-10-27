public class Hirt_Jared_Q3A {
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

/**
 OUTPUT
 After 0 years you would have $10000.00
 After 1 years you would have $10500.00
 After 2 years you would have $11025.00
 After 3 years you would have $11576.25
 After 4 years you would have $12155.06
 After 5 years you would have $12762.82
 */
