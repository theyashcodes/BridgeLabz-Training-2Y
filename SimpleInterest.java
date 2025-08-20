import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextInt(); // Example principal amount
        double rate = sc.nextInt(); // Example interest rate
        double time = sc.nextInt(); // Example time in years
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
    
}