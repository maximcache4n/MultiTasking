import java.util.Scanner;
import java.util.Random;

public class MultiTasking {

    // :9 Octopus was mandatory.
    public static void displayOctopus() {
        System.out.println("                         .---.         ,,");
        System.out.println("              ,,        /     \\       ;,,'");
        System.out.println("             ;, ;      (  o  o )      ; ;");
        System.out.println("               ;,';,,,  \\  \\/ /      ,; ;");
        System.out.println("            ,,,  ;,,,,;;,`   '-,;'''',,,'");
        System.out.println("           ;,, ;,, ,,,,   ,;  ,,,'';;,,;''';");
        System.out.println("              ;,,,;    ~~'  '';,,''',,;''''  ");
        System.out.println("                                 '''");
    }

    public static void basicCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Display the operation choices
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Result (Addition): " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result (Subtraction): " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result (Multiplication): " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result (Division): " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is undefined.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
        }

        pause();
    }


    public static void areaOfCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
        pause();
    }

    public static void simpleInterestCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time (in years): ");
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;
        System.out.println("The simple interest is: " + interest);
        pause();
    }

    public static void temperatureConverter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        pause();
    }

    public static void lotteryGame() {
        Random rand = new Random();
        System.out.println("Your lottery numbers are:");
        for (int i = 0; i < 6; i++) {
            int randomNumber = rand.nextInt(49) + 1;
            System.out.println(randomNumber);
        }
        pause();
    }

    public static void timeConverter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("Time: " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
        pause();
    }

    public static void shopCheckoutDisplay() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total cost of the item: ");
        double totalCost = sc.nextDouble();
        System.out.print("Enter the amount paid: ");
        double amountPaid = sc.nextDouble();

        if (amountPaid >= totalCost) {
            double change = amountPaid - totalCost;
            System.out.println("Change: " + change);
            System.out.println("Thank you for shopping with us! Goodbye!");
        } else {
            System.out.println("Insufficient payment. Please check the amount.");
        }
        pause();
    }

    public static void pause() {
        try {
            System.out.println("Returning to menu...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Error in pausing.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        displayOctopus();

        while (true) {
            System.out.println("\n--- Program Menu ---");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Area of Circle Calculator");
            System.out.println("3. Simple Interest Calculator");
            System.out.println("4. Temperature Converter (Celsius to Fahrenheit)");
            System.out.println("5. Lottery Game");
            System.out.println("6. Time Converter");
            System.out.println("7. Shop Checkout Display");
            System.out.println("8. Exit");
            System.out.print("Select an option (1-8): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    basicCalculator();
                    break;
                case 2:
                    areaOfCircle();
                    break;
                case 3:
                    simpleInterestCalculator();
                    break;
                case 4:
                    temperatureConverter();
                    break;
                case 5:
                    lotteryGame();
                    break;
                case 6:
                    timeConverter();
                    break;
                case 7:
                    shopCheckoutDisplay();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
