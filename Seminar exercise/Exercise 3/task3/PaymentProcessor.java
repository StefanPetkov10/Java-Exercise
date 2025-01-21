package task3;

import java.util.Scanner;

public class PaymentProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose payment method: 1 for CreditCard, 2 for PayPal");
        int choice = scanner.nextInt();
        scanner.nextLine();

        PaymentMethod paymentMethod;

        if (choice == 1) {
            System.out.println("Enter your credit card number:");
            String cardNumber = scanner.nextLine();
            paymentMethod = new CreditCard(cardNumber);
        } else if (choice == 2) {
            System.out.println("Enter your PayPal email:");
            String email = scanner.nextLine();
            paymentMethod = new PayPal(email);
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.println("Enter the amount to pay:");
        double amount = scanner.nextDouble();

        paymentMethod.processPayment(amount);
    }
}
