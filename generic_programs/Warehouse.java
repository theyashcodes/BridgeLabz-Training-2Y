import java.util.*;

abstract class WarehouseItem {}
class ElectronicsItem extends WarehouseItem { public String toString(){return "Electronics";}}
class GroceryItem extends WarehouseItem { public String toString(){return "Grocery";}}
class FurnitureItem extends WarehouseItem { public String toString(){return "Furniture";}}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    void add(T item){ items.add(item); }
}

public class Warehouse {
    static void showItems(List<? extends WarehouseItem> items){
        items.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<WarehouseItem> list = Arrays.asList(new ElectronicsItem(), new GroceryItem());
        showItems(list);
    }
}
