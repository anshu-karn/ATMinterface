import java.util.Scanner;

public class ATMExample {
    public static void main(String[] args) {
        int balance = 100000;
        int withdraw, deposit;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.nextLine(); // Clear the input buffer
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to be withdrawn:");
                    try {
                        withdraw = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.nextLine(); // Clear the input buffer
                        continue;
                    }

                    if (withdraw < 0) {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    } else if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the amount to be deposited:");
                    try {
                        deposit = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.nextLine(); // Clear the input buffer
                        continue;
                    }

                    if (deposit < 0) {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    } else {
                        balance += deposit;
                        System.out.println("Your money has been successfully deposited.");
                    }
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid operation.");
            }

            System.out.println();
        }
    }
}
