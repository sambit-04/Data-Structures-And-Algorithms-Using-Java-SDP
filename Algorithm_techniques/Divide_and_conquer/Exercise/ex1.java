class Tester {

    public static int[] getMaxMin(int arr[], int low, int high) {
        if (low == high) {
            // Base case: Only one element in the subarray
            return new int[] { arr[low], arr[low] };
        } else if (high - low == 1) {
            // Base case: Two elements in the subarray
            return new int[] { Math.max(arr[low], arr[high]), Math.min(arr[low], arr[high]) };
        } else {
            // Divide the array into two halves
            int mid = low + (high - low) / 2;
            int[] leftMaxMin = getMaxMin(arr, low, mid);
            int[] rightMaxMin = getMaxMin(arr, mid + 1, high);

            // Merge the results
            int overallMax = Math.max(leftMaxMin[0], rightMaxMin[0]);
            int overallMin = Math.min(leftMaxMin[1], rightMaxMin[1]);

            return new int[] { overallMax, overallMin };
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1000, 10, 5, 1, 2000 };

        int[] maxMin = getMaxMin(arr, 0, arr.length - 1);

        System.out.println("Minimum value is " + maxMin[1]);
        System.out.println("Maximum value is " + maxMin[0]);
    }
}
