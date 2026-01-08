import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args){
        boolean runProgram = true;
        while(runProgram) {
            Scanner scanner = new Scanner(System.in);
            // Mortgage Calculator Program
            try {
                // Get Principal
                System.out.println("Enter your loan as a whole number, i.e. 300000");
                System.out.print("Principal: ");
                int principal = scanner.nextInt();

                // Get down payment
                System.out.println();
                System.out.println("Enter your down payment as a whole number, i.e. 20000");
                System.out.print("Down payment: ");
                int downPayment = scanner.nextInt();

                // Calculate new principal
                principal -= downPayment;

                // Get Annual Interest Rate
                System.out.println();
                System.out.println("Enter interest as a decimal, i.e. 4.95");
                System.out.print("Annual Interest Rate: ");
                double annualInterestPercentage = scanner.nextDouble();

                // Convert to monthly interest rate
                double monthlyInterestRate = annualInterestPercentage / 100 / 12;

                // Get period
                System.out.println();
                System.out.println("Enter loan length as a whole number, i.e. 25");
                System.out.print("Period (Years): ");
                int yearlyPeriod = scanner.nextInt();

                // Convert to months
                int monthlyPeriod = yearlyPeriod * 12;

                // Calculate the monthly mortgage follow Method 2 of this article:
                // https://www.wikihow.com/Calculate-Mortgage-Payments
                double mortgage = principal * ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, monthlyPeriod)) / (Math.pow(1 + monthlyInterestRate, monthlyPeriod) - 1));
                // convert to dollars
                String monthlyMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

                // Give the good news
                System.out.println();
                System.out.println("We have successfully calculated your payment 🥳");
                System.out.print("Monthly Mortgage: " + monthlyMortgage);
                runProgram = false; // end program

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.nextLine(); // clear bad input
                // loop repeats automatically
            } // end catch
        } // end while
    } // end main
} // end class