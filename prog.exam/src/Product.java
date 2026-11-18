public class Product implements IProduct{
    private String[] productNames;
    private int[] sales;

    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }
    @Override
    public int GetTotalProductsSold() {
        // Add logic to calculate total sales
        return 0;
    }
    @Override
    public double GetAverageProductSold() {
        // Add logic to calculate average sales
        return 0.0;
    }
    @Override
    public String GetMostPopularProduct() {
        // Add logic to find the product
        // with the highest total sales
        return "";
    }
}
