import java.util.Scanner;                                  

public class Bankapp {
    public static void main(String[] args) {               
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my bank");         
        int attempts = 0;                                  
        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();
            if (pin == 1234) {
                double balance = 5000;
                while (true) {
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Account Balance");
                    System.out.println("4. Exit");
                    System.out.println();
                    System.out.println("Enter your choice: ");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        balance = balance + amount;
                        System.out.println("Deposit successful!");
                    } else if (choice == 2) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        if (amount > balance) {
                            System.out.println("Insufficient balance!");
                        } else {
                            balance = balance - amount;
                            System.out.println("Withdrawal successful!");
                        }
                    } else if (choice == 3) {
                        System.out.println("Account balance: " + balance);
                    } else if (choice == 4) {
                        System.out.println("Thank you for using our bank. Goodbye!");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                }
            } else {
                attempts++;
                if (attempts == 3) {
                    System.out.println("Contact bank");
                    System.exit(0); 
                } else {
                    System.out.println("Wrong PIN");
                }
            }
        }
    }
}


//Certainly! Let's go through the code and understand its functionality:

1. The program starts by importing the `Scanner` class, which allows us to read user input.

2. The `main` method is the entry point of the program.

3. The user is prompted with a welcome message.

4. The variable `attempts` is initialized to keep track of the number of PIN entry attempts.

5. A while loop is used to handle PIN entry. It will execute as long as the number of attempts is less than 3.

6. Inside the loop, the user is prompted to enter their PIN.

7. If the entered PIN matches the correct value (1234 in this case), the user is considered authenticated, and the banking operations menu is displayed.

8. The variable `balance` is initialized to 5000.

9. Another while loop is used to display the banking menu and handle the user's banking choices. This loop will continue until the user chooses to exit.

10. The user is presented with options to deposit, withdraw, check the account balance, or exit.

11. Based on the user's choice, the corresponding code block is executed.

12. If the user chooses to deposit, they are prompted to enter the amount, and the balance is updated accordingly.

13. If the user chooses to withdraw, they are prompted to enter the amount. If the amount is greater than the balance, an error message is displayed. Otherwise, the balance is updated by subtracting the withdrawn amount.

14. If the user chooses to check the account balance, the current balance is displayed.

15. If the user chooses to exit (choice 4), a farewell message is displayed, and the program is terminated using `System.exit(0)`.

16. If the user enters an invalid choice, an error message is displayed.

17. If the entered PIN is incorrect, the number of attempts is incremented. If the attempts reach 3, the user is prompted to contact the bank, and the program is terminated.

By using loops and conditional statements, the code handles PIN authentication, banking operations, and termination of the program based on user choices