package Chapter24;

import java.util.HashMap;

public class putAll {
    public static void main(String[] args) {
        putAll sample = new putAll();
        sample.putAll();
    }

    public void putAll() {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("A", "a");
        map1.put("B", "b");
        map1.put("C", "c");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("A", "a");
        map2.put("B", "bb");
        map2.put("C", "cc");

        map1.putAll(map2);

        System.out.println(map1);

    }
}
