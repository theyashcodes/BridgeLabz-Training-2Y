import java.util.Scanner;

public class QuadraticRoots {

    static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{}; // no real roots
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c for ax^2 + bx + c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots");
        } else {
            System.out.print("Roots: ");
        }
    }
}