
import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> books = new TreeMap<>();

        books.put("978-1111111111", "Java Basics");
        books.put("978-2222222222", "Python Guide");
        books.put("978-3333333333", "Data Structures");

        String search = "978-2222222222";
        System.out.println(search + " -> " + books.getOrDefault(search, "Book not found"));

        books.remove("978-1111111111");

        for(var e : books.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
