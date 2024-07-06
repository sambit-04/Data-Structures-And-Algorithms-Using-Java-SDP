class Tester {

    public static int searchEmployeeId(int[] employeeIds, int employeeIdToBeSearched) {
        for (int i = 0; i < employeeIds.length; i++) {
            if (employeeIds[i] == employeeIdToBeSearched) {
                // Employee ID found, return the number of iterations
                return i + 1; // Adding 1 to account for 1-based indexing
            }
        }
        // Employee ID not found
        return -1;
    }

    public static void main(String[] args) {
        int[] employeeIds = { 8011, 8012, 8015, 8016, 8020, 8022, 8025 };
        int employeeIdToBeSearched = 8022;

        int numberOfIterations = searchEmployeeId(employeeIds, employeeIdToBeSearched);

        if (numberOfIterations == -1)
            System.out.println("Employee ID " + employeeIdToBeSearched + " is not found!");
        else
            System.out.println("Employee ID " + employeeIdToBeSearched + " is found! Number of iterations: " + numberOfIterations);
    }
}
