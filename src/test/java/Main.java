import CurrencyConversion.Coin;
import CurrencyConversion.Coins;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

// I have tried using try-catch block without success.
// Also, throwing my exception upon invalid choice, terminates rather than returning to the loop.
    public static void main(String[] args) throws InvalidChoiceException, InputMismatchException, IOException {


        //one scanner to rule them all
        Scanner input = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.clearFile();

        //Screen 1: Welcome Screen
        System.out.println("Welcome to currency converter");

        // initialize a null String into which the answer on the fourth screen will be assigned.
        String answer = null;
        // a do-while loop: do x as long as y is true
            do {
                //Screen 2: Conversion options
                System.out.println("Please choose an option(1/2/3):");
                System.out.println("1. Dollars to Shekels");
                System.out.println("2. Shekels to Dollars");
                System.out.println("3. Euros to Shekels");

                //initialize an int variable and get user choice
                int firstChoice;
                firstChoice = input.nextInt();
                input.nextLine(); // This line you have to add (It consumes the \n character)
                //condition: answer can only be between 1 and 3
                if ((firstChoice >= 4) || (firstChoice <= 0)) {
                    throw new InputMismatchException();
                } else {
                    //initialize the amount variable
                    double amount;

                    //Screen 3: receives amount from user to convert.
                    System.out.println("Please enter an amount to convert");

                    amount = input.nextDouble();
                    input.nextLine(); // This line you have to add (It consumes the \n character)
                    ;
                    //If user entered 0 or negative value - throws exception (unnecessary?)
                    if (amount <= 0) {
                        throw new InputMismatchException();
                    } else {
                        //initializing the logger object and creating an empty array
                    List<String> list = new ArrayList<>();

                        //Switch case based on user's choice in screen 2
                        switch (firstChoice) {
                            case 1:
                                Coin ilsValue = CoinFactory.getCoinInstance(Coins.USD);
                                double value = ilsValue.calculate(amount);
                                String result = amount + "USD " + "are " + value + "ILS";
                                System.out.println(result);
                                list.add(result);
                                logger.logToFile(result);
                                System.out.println("Would you like to start over?(Y/N)");
                                answer = input.nextLine().toUpperCase();
                                break;

                            case 2:
                                Coin usdValue = CoinFactory.getCoinInstance(Coins.ILS);
                                double value1 = usdValue.calculate(amount);
                                String result1 = amount + "ILS " + "are " + value1 + "USD";
                                System.out.println(result1);
                                list.add(result1);
                                logger.logToFile(result1);
                                System.out.println("Would you like to start over?(Y/N)");
                                answer = input.nextLine().toUpperCase();
                                break;

                            case 3:
                                Coin ilsValue1 = CoinFactory.getCoinInstance(Coins.EUR);
                                double value2 = ilsValue1.calculate(amount);
                                String result2 = amount + "EUR " + "are " + value2 + "USD";
                                System.out.println(result2);
                                list.add(result2);
                                logger.logToFile(result2);
                                System.out.println("Would you like to start over?(Y/N)");
                                answer = input.nextLine().toUpperCase();
                                break;
                        }
                    }
                }
            } while (!answer.equalsIgnoreCase("N")); // as long as the answer is Y, the loop will run.
            // condition what to do in case user entered N
            if (answer.equalsIgnoreCase("N")) {
                System.out.println("Thanks for using our currency converter");
                //creating a String to host the contents of the created txt file with the user input's results
                String content = new String(Files.readAllBytes(Paths.get("results.txt")));
                System.out.println(content);
            }
    }
}


