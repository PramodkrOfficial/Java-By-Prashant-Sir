package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Pramod", 28);
        map.put("Surya", 24);
        map.put("Anand", 22);
        map.put("Saurabh", 32);
        map.put("Aditya", 0);

        System.out.println(map.size());
        System.out.println(map.get("Surya"));
        System.out.println(map.get("Pramod"));
        System.out.println(map.get("Saurabh"));
        System.out.println(map.get("Anand"));

        System.out.println(map.containsKey("Surya"));
        System.out.println(map.containsKey("Anand"));
        System.out.println(map.containsKey("Subhi"));
        System.out.println(map.containsKey("Angina"));

        System.out.println(map.remove("Aditya"));
        System.out.println(map.remove("Anand"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
}
