import java.util.HashMap;
import java.util.Map;

class Tester {

    public static Map<Character, Integer> findOccurrences(String input) {
        Map<Character, Integer> occurrenceMap = new HashMap<>();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Update the count in the map
            occurrenceMap.put(ch, occurrenceMap.getOrDefault(ch, 0) + 1);
        }

        return occurrenceMap;
    }

    public static void main(String args[]) {
        String input = "occurrence";
        Map<Character, Integer> occurrenceMap = findOccurrences(input);

        System.out.println("Occurrences of characters\n=======================");
        for (Map.Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
