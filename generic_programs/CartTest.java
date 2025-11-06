import java.util.*;

class Cart<T> {
    List<T> items = new ArrayList<>();
    void addItem(T i){ items.add(i); }
    void removeItem(T i){ items.remove(i); }
    void displayItems(){ items.forEach(System.out::println); }
}

class Electronics{ public String toString(){return "Electronics";} }
class Clothing{ public String toString(){return "Clothing";} }

public class CartTest {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics());

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing());

        eCart.displayItems();
        cCart.displayItems();
    }
}
