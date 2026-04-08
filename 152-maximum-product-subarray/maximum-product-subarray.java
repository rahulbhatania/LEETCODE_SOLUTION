class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];

        
        for (int i = 1; i < n; i++) {
            int curr = nums[i];

            if (curr < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(curr, max * curr);
            min = Math.min(curr, min * curr);
            
            res = Math.max(max, res);
        }

        return res;
    }
}
