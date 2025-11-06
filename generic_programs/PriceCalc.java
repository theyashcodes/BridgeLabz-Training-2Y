import java.util.*;

class Product { double price; Product(double p){price=p;} double getPrice(){return price;} }
class Mobile extends Product { Mobile(double p){super(p);} }
class Laptop extends Product { Laptop(double p){super(p);} }

public class PriceCalc {
    public static double calculateTotal(List<? extends Product> items) {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    public static void main(String[] args) {
        System.out.println(calculateTotal(Arrays.asList(new Mobile(50000), new Laptop(70000))));
    }
}
