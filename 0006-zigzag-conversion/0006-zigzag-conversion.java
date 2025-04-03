class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s; // Handle edge case where numRows is 1 or less

        StringBuilder[] rows = new StringBuilder[numRows]; // To store each row of the zigzag pattern
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int len = s.length();
        int row = 0;
        int step = 1; // Direction: 1 means moving down, -1 means moving up

        for (int i = 0; i < len; i++) {
            rows[row].append(s.charAt(i)); // Add the character to the current row

            // Change direction if we reach the top or bottom row
            if (row == 0) step = 1;
            else if (row == numRows - 1) step = -1;

            row += step; // Move to the next row
        }

        // Combine all the rows to form the final result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(rows[i].toString());
        }

        return result.toString();
    }
}
