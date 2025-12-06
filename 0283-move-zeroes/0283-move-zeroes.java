class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Correct zero fill
        for (int j = k; j < nums.length; j++) {
            nums[j] = 0;
        }

        // Debug print (remove when submitting)
        for (int l = 0; l < nums.length; l++) {
            System.out.print(nums[l] + " ");
        }
    }
}

