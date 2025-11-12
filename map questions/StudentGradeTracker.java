
import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>();

        grades.put("Aman", 85.0);
        grades.put("Ria", 90.0);
        grades.put("Mohit", 78.0);

        grades.put("Aman", 92.0);
        grades.remove("Mohit");

        for(var e : grades.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
