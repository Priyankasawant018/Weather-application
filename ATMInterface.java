import java.util.Scanner;

public class ATMInterface {

    // Assuming the ATM has a single user for simplicity
    private static final String ACCOUNT_NUMBER = "12345678";
    private static final String PIN = "1234";
    private static double balance = 1000.00; // Initial balance

    // Method to check balance
    private static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    // Method to withdraw money
    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            balance -= amount;
            System.out.printf("You have withdrawn $%.2f. Your new balance is $%.2f.%n", amount, balance);
        }
    }

    // Method to deposit money
    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            balance += amount;
            System.out.printf("You have deposited $%.2f. Your new balance is $%.2f.%n", amount, balance);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Authenticate user
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        if (!ACCOUNT_NUMBER.equals(accountNumber) || !PIN.equals(pin)) {
            System.out.println("Invalid account number or PIN.");
            scanner.close();
            return;
        }

        // ATM operations
        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney(scanner);
                    break;
                case 3:
                    depositMoney(scanner);
                    break;
                case 4:
                    System.out.println("Exiting. Thank you for using the ATM.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
