import java.util.*;
public class hmap03 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("A",1);
        lhm.put("B",2);
        lhm.put("C",3);
        lhm.put("D",4);
        lhm.put("E",5);

        TreeMap<String,Integer> thm = new TreeMap<>();
        thm.put("A",1);
        thm.put("B",2);
        thm.put("C",3);
        thm.put("D",4);
        thm.put("E",5);
        System.out.println(lhm);
        System.out.println(thm);
    }
}
