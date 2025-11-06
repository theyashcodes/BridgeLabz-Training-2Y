import java.util.*;

class Vehicle {}
class Truck extends Vehicle { public String toString(){return "Truck";} }
class Bike extends Vehicle { public String toString(){return "Bike";} }

class FleetManager<T extends Vehicle> {
    List<T> fleet = new ArrayList<>();
    void addVehicle(T t){ fleet.add(t); }
    void showFleet(){ fleet.forEach(System.out::println); }
}

public class FleetManagerTest {
    public static void main(String[] args) {
        FleetManager<Truck> t = new FleetManager<>();
        t.addVehicle(new Truck());
        t.showFleet();

        FleetManager<Bike> b = new FleetManager<>();
        b.addVehicle(new Bike());
        b.showFleet();
    }
}
