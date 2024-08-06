import java.util.*;

public class hmap07 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("noida");
        cities.add("bengaluru");

//        Iterator it = cities.iterator();
//        while(it.hasNext()){
//            System.out. println(it.next());
//        }
//
//        for (String city:cities){
//            System.out.println(city);
//        }
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("noida");
        lhs.add("bengaluru");
        System.out.println(lhs);


        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("mumbai");
        ts.add("noida");
        ts.add("bengaluru");
        System.out.println(ts);

    }
}
