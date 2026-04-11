class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            int k = i + 1;
            while (k < n - 1) {
                int j = k + 1;
                while (j < n) {
                    if (nums[i] == nums[k] && nums[k] == nums[j]) {
                        int sum = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                        if (sum < minSum) {
                            minSum = sum;
                        }
                    }
                    j++;
                }
                k++;
            }
        }
        
        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }
}

