import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Not a natural number.");
            return;
        }

        int[] odd = new int[number/2 + 1];
        int[] even = new int[number/2 + 1];
        int oi = 0, ei = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) even[ei++] = i;
            else odd[oi++] = i;
        }

        System.out.print("Odd: ");
        for (int i = 0; i < oi; i++) System.out.print(odd[i] + " ");
        System.out.print("\nEven: ");
        for (int i = 0; i < ei; i++) System.out.print(even[i] + " ");
    }
}
