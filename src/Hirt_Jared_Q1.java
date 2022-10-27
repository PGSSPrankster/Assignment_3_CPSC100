public class Hirt_Jared_Q1 {
    public static void main(String[] args) {
        double principal = 10000;
        for(int i=0; i<=5; i++)
        {
            System.out.printf("Money in account after %d years $%.2f %n", i, principal);
            principal = interestYear(principal);
        }

    }
    public static double interestYear(double principal){
        for(int i = 1; i <= 6; i++)
            principal = principal * 0.9d * 1.1d;
        return principal;
        }
    }

    /**
     OUTPUT
     Money in account after 0 years $10000.00
     Money in account after 1 years $9414.80
     Money in account after 2 years $8863.85
     Money in account after 3 years $8345.14
     Money in account after 4 years $7856.78
     Money in account after 5 years $7397.00
     */