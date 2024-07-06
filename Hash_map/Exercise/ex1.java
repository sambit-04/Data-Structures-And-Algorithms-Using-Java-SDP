import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

class Student {
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
        Map<String, Double> result = new HashMap<>();

        double maxMarks = Double.MIN_VALUE;
        double minMarks = Double.MAX_VALUE;
        String topScorer = null;
        String lowScorer = null;

        for (Entry<String, Double> entry : studentMarks.entrySet()) {
            String studentName = entry.getKey();
            double marks = entry.getValue();

            if (marks > maxMarks) {
                maxMarks = marks;
                topScorer = studentName;
            }

            if (marks < minMarks) {
                minMarks = marks;
                lowScorer = studentName;
            }
        }

        result.put("Top Scorer", maxMarks);
        result.put("Low Scorer", minMarks);

        return result;
    }

    public static void main(String[] args) {
        Map<String, Double> studentMarks = new HashMap<>();
        studentMarks.put("Lily", 90.0);
        studentMarks.put("Robin", 68.0);
        studentMarks.put("Marshall", 76.5);
        studentMarks.put("Neil", 67.0);
        studentMarks.put("Ted", 92.0);

        Map<String, Double> maxMinScorers = findMaxMinScorers(studentMarks);

        System.out.println("Details of Top Scorers & Low Scorers\n====================================");
        for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
