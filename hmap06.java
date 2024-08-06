
import java.util.*;
public class hmap06 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);

        set.remove(3);
        set.remove(2);
        System.out.println(set.size());
        set.clear();
        System.out.println(set.size());
    }
}
