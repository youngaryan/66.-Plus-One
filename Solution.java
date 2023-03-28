class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Handle negative integers or zero
        if (n == 0) {
            return new int[]{1};
        }

        // Handle the general case
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        // If all digits are 9, create a new array with an additional digit
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}

