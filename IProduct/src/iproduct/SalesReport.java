package iproduct;

import java.util.Scanner;

public class SalesReport {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] prompts = {"Cozy Nights Monarch mattress",
                            "Restonic Barbados mattress",
                            "Sealy Phuket mattress"};
        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int months = 3;
        int[][] sales = new int[names.length][months];

        for (int p = 0; p < names.length; p++) {
            for (int m = 0; m < months; m++) {
                sales[p][m] = readInt("Enter number of sales for month " + (m + 1)
                        + " for " + prompts[p] + ": ");
            }
            System.out.println();
        }

        PrintProduct printer = new PrintProduct(new Product(names, sales));
        printer.printHeader();
        printer.printTotalSales();
        printer.printAverageSales();
        printer.printMostPopular();
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(input.nextLine().trim());
                if (value >= 0) return value;
            } catch (NumberFormatException ignored) { }
            System.out.println("Please enter a valid whole number (0 or more).");
        }
    }
}
