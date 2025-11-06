import java.util.*;

abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}

class Resume<T extends JobRole> {
    T role;
    Resume(T role){ this.role = role; }
}

public class Screening {
    public static void process(List<? extends JobRole> list){
        list.forEach(r -> System.out.println("Processing: " + r.getClass().getSimpleName()));
    }
}
