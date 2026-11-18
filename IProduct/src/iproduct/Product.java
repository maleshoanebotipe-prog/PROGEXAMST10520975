package iproduct;

public class Product implements IProduct {
    private final String[] names;   // 1D array
    private final int[][] sales;    // 2D array [product][month]

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] productSales : sales) {
            for (int monthSales : productSales) {
                total += monthSales;
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int count = sales.length * sales[0].length;
        return count == 0 ? 0 : (double) GetTotalProductsSold() / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int max = Integer.MIN_VALUE;
        String best = "";
        for (int i = 0; i < sales.length; i++) {
            for (int monthSales : sales[i]) {
                if (monthSales > max) {
                    max = monthSales;
                    best = names[i];
                }
            }
        }
        return best + "(" + max + ")";
    }
}