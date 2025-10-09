package sample;

import java.util.HashMap;
import java.util.Map;

public class yyy {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");

        map.put(3, "Three");

        map.put(2, "Two");

        map.put(5, "Five");

        map.put(4, "Four");

        // 输出的顺序不固定

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

    }
}
