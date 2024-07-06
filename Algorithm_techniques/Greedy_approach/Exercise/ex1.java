class Tester {

    public static int findMaxActivities(int start[], int finish[]) {
        int n = start.length;
        int count = 1; // At least one activity can be performed (the one with the earliest finish time)
        int lastFinish = finish[0]; // Initialize with the finish time of the first activity

        for (int i = 1; i < n; i++) {
            if (start[i] >= lastFinish) {
                // If the next activity starts after the last one finishes, it can be performed
                count++;
                lastFinish = finish[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int finish[] = { 2, 4, 6, 7, 9, 9 };

        System.out.println("Maximum number of activities: " + findMaxActivities(start, finish));
    }
}
