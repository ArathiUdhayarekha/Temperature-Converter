import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Accept temperature input
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        // Step 3: Allow user to choose the conversion direction
        System.out.println("\nChoose the conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double result;

        // Step 2: Implement logic for temperature conversion
        if (choice == 1) {
            result = (temperature * 9/5) + 32;
            System.out.printf("\n%.2f°C is equal to %.2f°F.\n", temperature, result);
        } else if (choice == 2) {
            result = (temperature - 32) * 5/9;
            System.out.printf("\n%.2f°F is equal to %.2f°C.\n", temperature, result);
        } else {
            System.out.println("\nInvalid choice. Please select 1 or 2.");
        }

        // Step 4: End the program
        scanner.close();
    }
}
