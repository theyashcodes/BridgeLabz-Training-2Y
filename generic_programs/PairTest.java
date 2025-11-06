class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T f, U s) { first = f; second = s; }
    public T getFirst() { return first; }
    public U getSecond() { return second; }
}

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Amol", 20);
        System.out.println(student.getFirst() + " " + student.getSecond());
    }
}
