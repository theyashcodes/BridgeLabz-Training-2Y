import java.util.Scanner;

public class ConvertKilometerstoMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilometers = scanner.nextInt(); // Example distance in kilometers
        double miles = kilometers * 0.621371; // Conversion factor
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}