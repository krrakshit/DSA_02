import java.util.*;
public class hmap01 {
    public static void main(String[] args) {
        // create hashmap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("china",50);
        hm.put("us",44);
       // System.out.println(hm);


        int p = hm.get("India");
        //System.out.println(p);

        // contains key
       // System.out.println(hm.containsKey("kuch bhi"));
        //System.out.println(hm.containsKey("India"));

        // remove
       // hm.remove("china");
       // System.out.println(hm);
      //  System.out.println(hm.size());

        // clear function removes all the data
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k: keys) {
            System.out.println("key="+k+",value="+hm.get(k));
        }
    }
}
