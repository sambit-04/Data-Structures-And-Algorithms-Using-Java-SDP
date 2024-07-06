class Tester {

    public static int findMaxSum(int arr[], int low, int high) {
        if (low == high) {
            return arr[low]; // Base case: Only one element in the subarray
        }

        int mid = (low + high) / 2;

        // Recursively find the maximum sum in left and right halves
        int leftMaxSum = findMaxSum(arr, low, mid);
        int rightMaxSum = findMaxSum(arr, mid + 1, high);

        // Find the maximum sum crossing the middle element
        int crossingMaxSum = findMaxCrossingSubarraySum(arr, low, mid, high);

        // Return the maximum of the three sums
        return Math.max(Math.max(leftMaxSum, rightMaxSum), crossingMaxSum);
    }

    public static int findMaxCrossingSubarraySum(int arr[], int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;

        // Calculate the maximum sum in the left half
        for (int i = mid; i >= low; i--) {
            sum += arr[i];
            leftSum = Math.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;

        // Calculate the maximum sum in the right half
        for (int i = mid + 1; i <= high; i++) {
            sum += arr[i];
            rightSum = Math.max(rightSum, sum);
        }

        // Return the sum of left and right halves
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -5, 6, -2, -3, 1, 5, -6 };
        System.out.println("Maximum sum: " + findMaxSum(arr, 0, arr.length - 1));
    }
}
