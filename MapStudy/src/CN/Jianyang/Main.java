package CN.Jianyang;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        put(key,value), get back value.
         */
        function2();
    }

    public static void function1() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("who", 2345);
        Integer value1 = map1.put("who", 123);
        map1.put("where", 345);
        map1.put("when", 567);
        map1.put("how", 567);
        map1.remove("how", 567);
        Set key1 = map1.keySet();
        Integer value2 = map1.get("when");
        System.out.println(map1);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(key1);

        Iterator<String> value3 = key1.iterator();
        while (value3.hasNext()) {
            String key2 = value3.next();
            Integer value4 = map1.get(key2);
            System.out.println(key2 + " is " + value4);
        }
    }

    public static void function2() {
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("a", 1);
        map2.put("b", 4);
        map2.put("c", 5);
        map2.put("d", 6);
        map2.put("e", 7);
        map2.put("f", 8);
        map2.put("g", 9);

        Set set1 = map2.keySet();
        Iterator<String> It = set1.iterator();

        while (It.hasNext()) {
            String key = It.next();
            Integer value = map2.get(key);

            System.out.println(key + " is the key of " + value);
        }

    }
}
