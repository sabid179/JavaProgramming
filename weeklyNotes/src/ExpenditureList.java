import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExpenditureList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = readBalanceFromFile(); // read previous balance from file
        int option = 0;

        while (option != 4) {
            System.out.println("Enter an option:");
            System.out.println("1. Add to balance");
            System.out.println("2. Subtract from balance");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            option = input.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Enter amount to add:");
                    int add = input.nextInt();
                    balance += add;
                    writeBalanceToFile(balance); // write new balance to file
                    System.out.println("Balance updated.");
                    break;
                case 2:
                    System.out.println("Enter amount to subtract:");
                    int subtract = input.nextInt();
                    balance -= subtract;
                    writeBalanceToFile(balance); // write new balance to file
                    System.out.println("Balance updated.");
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1, 2, 3, or 4.");
            }
        }
    }

    private static int readBalanceFromFile() {
        try {
            Scanner fileInput = new Scanner(new File("balance.txt"));
            int balance = fileInput.nextInt();
            fileInput.close();
            return balance;
        } catch (FileNotFoundException e) {
            return 0;
        }
    }

    private static void writeBalanceToFile(int balance) {
        try {
            PrintWriter fileOutput = new PrintWriter("balance.txt");
            fileOutput.println(balance);
            fileOutput.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to save balance.");
        }
    }
}
