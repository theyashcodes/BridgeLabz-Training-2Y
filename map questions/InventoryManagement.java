
import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        stock.put("Rice", 50);
        stock.put("Oil", 20);
        stock.put("Sugar", 10);

        stock.put("Rice", stock.get("Rice") - 45);
        stock.put("Oil", stock.get("Oil") - 20);

        stock.put("Rice", stock.get("Rice") + 30);

        for(var p : stock.entrySet()){
            if(p.getValue() <= 0)
                System.out.println(p.getKey() + " is OUT OF STOCK");
        }

        String query = "Sugar";
        System.out.println(query + " -> " + stock.getOrDefault(query, 0));
    }
}
