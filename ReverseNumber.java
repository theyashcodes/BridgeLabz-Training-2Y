import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();


        int temp = num, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }


        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }


        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }


        System.out.print("Reversed number: ");
        for (int d : reverse) {
            System.out.print(d);
        }
    }
}
