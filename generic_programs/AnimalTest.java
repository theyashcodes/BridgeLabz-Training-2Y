import java.util.*;

class Animal { }
class Dog extends Animal { public String toString(){return "Dog";} }
class Cat extends Animal { public String toString(){return "Cat";} }

public class AnimalTest {
    public static void printAnimals(List<? extends Animal> animals) {
        animals.forEach(System.out::println);
    }

    public static void main(String[] args) {
        printAnimals(Arrays.asList(new Dog(), new Dog()));
        printAnimals(Arrays.asList(new Cat(), new Cat()));
    }
}
