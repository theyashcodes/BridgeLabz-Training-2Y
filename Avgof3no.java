import java.util.Scanner;

public class Avgof3no {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        double num1 = v.nextInt(); // Example number 1
        double num2 = v.nextInt(); // Example number 2
        double num3 = v.nextInt(); // Example number 3
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average of the three numbers: " + average);
    }
}