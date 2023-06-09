class Solution {
    /**
     * Converts the given column title to its corresponding column number.
     *
     * @param columnTitle the column title to be converted
     * @return the column number
     */
    public int titleToNumber(String columnTitle) {
        char[] titleList = columnTitle.toCharArray();
        int result = 0; // Final result
        int power = 1; // Variable for calculating powers of 26

        for (int i = columnTitle.length() - 1; i > -1; i--) {
            int value = titleList[i] - '@'; // Calculate the numeric value corresponding to the current character
            result += value * power; // Add the value of the current position to the result
            power *= 26; // Update power to calculate the next position's power of 26
        }

        return result; // Return the final result
    }
}
