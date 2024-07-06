import java.util.List;
import java.util.ArrayList;

class Tester {
    static int count = 0;

    public static void findWordSegments(List<String> wordsList, String inputString) {
        findSegmentsHelper(wordsList, inputString, 0);
    }

    private static void findSegmentsHelper(List<String> wordsList, String inputString, int index) {
        if (index == inputString.length()) {
            count++; // Reached the end, valid word segment found
            return;
        }

        for (String word : wordsList) {
            if (inputString.startsWith(word, index)) {
                findSegmentsHelper(wordsList, inputString, index + word.length());
            }
        }
    }

    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();
        wordsList.add("i");
        wordsList.add("like");
        wordsList.add("pizza");
        wordsList.add("li");
        wordsList.add("ke");
        wordsList.add("pi");
        wordsList.add("zza");

        String inputString = "ilikepizza";
        findWordSegments(wordsList, inputString);
        System.out.println("Number of segments: " + count);
    }
}
