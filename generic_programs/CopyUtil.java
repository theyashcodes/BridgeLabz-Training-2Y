import java.util.*;

public class CopyUtil {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        List<Number> d = new ArrayList<>();
        List<Integer> s = Arrays.asList(1,2,3);
        copyList(d, s);
        System.out.println(d);
    }
}
