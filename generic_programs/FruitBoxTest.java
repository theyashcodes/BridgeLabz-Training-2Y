class Fruit { }
class Apple extends Fruit { public String toString(){return "Apple";} }
class Mango extends Fruit { public String toString(){return "Mango";} }

class FruitBox<T extends Fruit> {
    java.util.List<T> list = new java.util.ArrayList<>();
    void add(T t) { list.add(t); }
    void show() { list.forEach(System.out::println); }
}

public class FruitBoxTest {
    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Apple());
        box.show();
    }
}
