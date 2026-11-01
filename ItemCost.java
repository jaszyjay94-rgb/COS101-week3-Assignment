import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Item Cost Calculator ===");

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter the cost per item: ");
        double costPerItem = input.nextDouble();

        if (quantity < 0 || costPerItem < 0) {
            System.out.println("Quantity and cost cannot be negative.");
            input.close();
            return;
        }

        double totalCost = quantity * costPerItem;

        System.out.println("\n=== Cost Summary ===");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Cost per item: %.2f%n", costPerItem);
        System.out.printf("Total cost: %.2f%n", totalCost);

        input.close();
    }
}
