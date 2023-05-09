package staticAssignment;

import java.util.Scanner;

public class SalesStaticVariableFunction {

    // Static variable salesTaxForTexas
    private static final double salesTaxForTexas = 6.25;

    // Non static variable salesAmount
    private double salesAmount;

    // Default constructor
    public SalesStaticVariableFunction() {
    }

    // Setter method where static variable salesTaxForTexas is used
    public double setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount * salesTaxForTexas;
        return this.salesAmount;
    }

    // Static method where static variable salesTaxForTexas is used
    public static void nextYearSalesTaxForTexas(){
        double nextYearSalesTaxForTexas = salesTaxForTexas * 1.2;
        System.out.println("Note: Sales tax for Texas next year will be => "  + nextYearSalesTaxForTexas + "%");;
    }

    public static void main(String[] args) {
        nextYearSalesTaxForTexas();
        System.out.print("\n");
        System.out.print("Enter Sales Amount (Numbers only): ");

        try(Scanner scanner = new Scanner(System.in)) {
            int enteredSales = scanner.nextInt();
            SalesStaticVariableFunction sales = new SalesStaticVariableFunction();
            System.out.println("Total sales amount including Texas sales tax (6.25%) is: $" + sales.setSalesAmount(enteredSales));
        }catch(Exception ex) {
            System.out.println("Invalid input!!!");
            ex.printStackTrace();
        }
    }
}