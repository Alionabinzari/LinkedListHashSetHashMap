
import java.util.*;

public class Main {
    public static void main(String[] args) {
    //HashMap
        Map<String, Integer> map= new HashMap();

        map.put("Paris",111);
        map.put("Milano",222);
        map.put("Chisinau",333);

      //  System.out.println(map.get("111"));
        for (Map.Entry <String, Integer> entry: map.entrySet())
        System.out.println(entry.getKey() + " " + entry.getValue());

    // LinkedHashMap
        Map<String, Integer> map2= new LinkedHashMap();
        map2.put("Paris",111);
        map2.put("Milano",222);
        map2.put("Chisinau",333);

        //  System.out.println(map.get("111"));
        for (Map.Entry <String, Integer> entry: map2.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        Map<String, Integer> map3= new LinkedHashMap();
                map3.put("Paris",111);
                map3.put("Milano",222);
                map3.put("Chisinau",333);

                //  System.out.println(map.get("111"));
                for (Map.Entry <String, Integer> entry: map3.entrySet())
                    System.out.println(entry.getKey() + " " + entry.getValue());
    }
}