package StoreApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> products = new HashMap<>();

        while (true) {
            System.out.println("1. Add product");
            System.out.println("2. Update product price");
            System.out.println("3. Remove product");
            System.out.println("4. Show all products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.next();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    products.put(productName, productPrice);
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    System.out.print("Enter product name to update price: ");
                    String productNameToUpdate = scanner.next();
                    if (products.containsKey(productNameToUpdate)) {
                        System.out.print("Enter new price: ");
                        double newPrice = scanner.nextDouble();
                        products.put(productNameToUpdate, newPrice);
                        System.out.println("Price updated successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter product name to remove: ");
                    String productToRemove = scanner.next();
                    if (products.containsKey(productToRemove)) {
                        products.remove(productToRemove);
                        System.out.println("Product removed successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.println("Products:");
                    for (Map.Entry<String, Double> entry : products.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

