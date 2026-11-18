package iproduct;

import java.text.DecimalFormat;

public class PrintProduct {
    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void printHeader() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*".repeat(40));
    }

    public void printTotalSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void printAverageSales() {
        System.out.println("AVERAGE PRODUCT SALES: "
                + new DecimalFormat("0.##").format(product.GetAverageProductSold()));
    }

    public void printMostPopular() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}