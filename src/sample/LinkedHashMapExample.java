package sample;

import java.util.LinkedHashMap;
import java.util.Map;
 
public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("banana", 2);
        linkedHashMap.put("apple", 1);
        linkedHashMap.put("orange", 3);
        
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}