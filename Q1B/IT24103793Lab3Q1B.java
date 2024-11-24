import java.util.Scanner;

public class IT24103793Lab3Q1B {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

               System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();  // Read the price as a double

               System.out.print("Enter the number of kilograms you want to buy: ");
        double kgToBuy = scanner.nextDouble();  // Read the quantity as a double

                double totalAmount = pricePerKg * kgToBuy;

               double discount = totalAmount * 0.10;

       
        double finalAmount = totalAmount - discount;

               System.out.printf("Total amount before discount: %.2f\n", totalAmount);
        System.out.printf("Discount (10%%): %.2f\n", discount);
        System.out.printf("The final amount to pay after discount is: %.2f\n", finalAmount);

               scanner.close();
    }
}
