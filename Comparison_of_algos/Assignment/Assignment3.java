class Tester {
    public static int findSwapCount(String inputString) {
        int swaps = 0; // Initialize the total swaps
        int count = 0; // Initialize the count of unbalanced brackets

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == '(') {
                count++;
            } else {
                count--;
                if (count < 0) {
                    // Find the next opening bracket
                    int j = i + 1;
                    while (j < inputString.length() && inputString.charAt(j) != '(') {
                        j++;
                    }
                    swaps += j - i; // Calculate swaps
                    // Swap characters at indices i and j
                    char temp = inputString.charAt(j);
                    inputString = inputString.substring(0, i) + temp + inputString.substring(i + 1, j) + inputString.substring(j + 1);
                    count = 1; // Reset count
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        String inputString = "())()(";
        System.out.println("Number of swaps: " + findSwapCount(inputString));
    }
}
