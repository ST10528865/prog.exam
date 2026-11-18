public class ProductTest {

    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue(){
        String[] products = {
                "Cozy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
        };
        int [][] sales = {
                {25, 18, 20},
                {15, 10, 12},
                {18, 15, 20}
        };
        Product product = new Product(products, sales);
        // Write the assertion to verify the total
}

    public void GetAverageSales_WithValidData_ReturnsCorrectValue(){
        String[] product = {
                "Cozy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
        };
        int[][] sales = {
                {25, 18, 20},
                {15, 10, 12},
                {18, 15, 20}
        };
        Product product = new Product(products, sales);
        // Write the assertion to verify the average
    }
}
