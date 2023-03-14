// Calculate the interest amount on a deposit.
public class Interest {
    public static void main(String[] args) {

        double principal = 1000.0;
        double rate = 0.05;


        // Print a report header...
        System.out.printf("%s%20s%n", "Year", "Amount on Deposit");

        // Calculate the amount on deposit for each of ten years.
        for( int year = 1; year <= 10; ++year){

            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%, 20.2f%n", year, amount);
        }
    }
}