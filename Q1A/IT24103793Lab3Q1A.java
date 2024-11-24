import java.util.Scanner;

public class IT24103793Lab3Q1A {
    public static void main(String[] args) {

               Scanner scanner = new Scanner(System.in);
       		 System.out.print("Enter the price of 1kg of rice: ");
       		 double pricePerKg = scanner.nextDouble();
                System.out.print("Enter the number of kilograms you want to buy: ");
      		  double kgToBuy = scanner.nextDouble();  // Read the quantity as a double

                double totalAmount = pricePerKg * kgToBuy;

                System.out.printf("The total amount to pay is: %.2f\n", totalAmount);

                scanner.close();
    }
}