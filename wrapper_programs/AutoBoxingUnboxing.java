import java.util.*;
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 10, 15, 20, 5);

        int sum = 0;
        for(Integer n : list) sum += n;

        System.out.println("Sum of numbers = " + sum);
    }
}
