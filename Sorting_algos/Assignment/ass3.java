class Tester {

    public static void sortArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are out of order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int findMaxSum(int arr[], int m) {
        int n = arr.length;
        if (m > n) {
            return 0; // Not enough elements in the array
        }
        int maxSum = 0;
        for (int i = n - 1; i >= n - m; i--) {
            maxSum += arr[i];
        }
        return maxSum;
    }

    public static int findMinSum(int arr[], int m) {
        int n = arr.length;
        if (m > n) {
            return 0; // Not enough elements in the array
        }
        int minSum = 0;
        for (int i = 0; i < m; i++) {
            minSum += arr[i];
        }
        return minSum;
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        sortArray(arr);

        int m1 = 4;
        int m2 = 3;

        System.out.println("Maximum Sum for m=" + m1 + ": " + findMaxSum(arr, m1));
        System.out.println("Minimum Sum for m=" + m2 + ": " + findMinSum(arr, m2));
    }
}
