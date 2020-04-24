import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {

        Map<String,Integer> hasMap = new HashMap<>();
        hasMap.put("Nam",30);
        hasMap.put("Duc",20);
        hasMap.put("Hung",23);
        hasMap.put("Thuy",24);

        System.out.println("Display entries in hasMap :");

        System.out.println(hasMap+"\n");

        Map<String,Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println("Display entries in ascending order of key :");
        System.out.println(treeMap);

        Map<String,Integer> linkedHasMap = new LinkedHashMap<>(16,0.75f,true);

        linkedHasMap.put("Nam",30);
        linkedHasMap.put("Duc",20);
        linkedHasMap.put("Hung",23);
        linkedHasMap.put("Thuy",24);

        System.out.println("\nThe age for"+" Nam is "+linkedHasMap.get("Nam"));
    }
}
