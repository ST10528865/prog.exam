//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] products = {
                "Cozy Night Monarch",
                "Restonic Barbados",
                "Sealy Phuket",
        };
        int [][] sales = new int[3][3];
        // Capture sales for each product
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print("Enter sales for month" + (j + 1) + "for" + products[i] + ":");
                sales[i][j] = input.nextInt();
            }
        }
    // Create Product object
        Product product = new Product(products, sales);
        // Print Report
        PrintProduct print = new PrintProduct();
        print.PrintReport(product);
        input.close();
    }
}
