class Tester {

    public static int searchCustomerId(int customerIds[], int customerIdToBeSearched) {
        int left = 0;
        int right = customerIds.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (customerIds[mid] == customerIdToBeSearched) {
                return mid; // Customer ID found at index mid
            } else if (customerIds[mid] < customerIdToBeSearched) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        // Customer ID not found
        return -1;
    }

    public static void main(String[] args) {
        int[] customerIds = { 80451, 80462, 80465, 80479, 80550, 80561, 80665, 80770 };
        int customerIdToBeSearched = 80462;

        int index = searchCustomerId(customerIds, customerIdToBeSearched);

        if (index == -1)
            System.out.println("Customer ID " + customerIdToBeSearched + " is not found!");
        else
            System.out.println("Customer ID " + customerIdToBeSearched + " is found at index position " + index + "!");
    }
}
