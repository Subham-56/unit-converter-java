import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nUnit Converter:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Kilometers to Miles");
            System.out.println("3. Kilograms to Pounds");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }
            
            System.out.print("Enter value: ");
            double value = scanner.nextDouble();
            
            switch (choice) {
                case 1:
                    System.out.println("Result: " + (value * 9/5 + 32) + " °F");
                    break;
                case 2:
                    System.out.println("Result: " + (value * 0.621371) + " miles");
                    break;
                case 3:
                    System.out.println("Result: " + (value * 2.20462) + " lbs");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
