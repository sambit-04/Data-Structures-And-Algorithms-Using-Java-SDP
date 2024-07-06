import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester {
    
    public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo) {
        Map<String, Integer> mergedMap = new HashMap<>();

        // Merge entries from mapOne
        for (Entry<String, Integer> entry : mapOne.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            mergedMap.put(key, value);
        }

        // Merge entries from mapTwo, handling duplicate keys
        for (Entry<String, Integer> entry : mapTwo.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            // Check if the key already exists in mergedMap
            if (mergedMap.containsKey(key)) {
                // Concatenate "new" with the key for duplicate keys
                key = "new" + key;
            }

            // Add the entry to mergedMap
            mergedMap.put(key, value);
        }

        return mergedMap;
    }

    public static void main(String args[]) {
        Map<String, Integer> mapOne = new HashMap<String, Integer>();
        mapOne.put("Kelly", 10);
        mapOne.put("Micheal", 20);
        mapOne.put("Ryan", 30);
        
        Map<String, Integer> mapTwo = new HashMap<String, Integer>();
        mapTwo.put("Jim", 15);
        mapTwo.put("Andy", 45);

        Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

        System.out.println("Merged Map\n===========");
        for (Entry<String, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
