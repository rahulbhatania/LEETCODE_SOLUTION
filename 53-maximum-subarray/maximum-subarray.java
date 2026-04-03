class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum =0;
        int maxsum=0;
        
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            
            if(maxsum<sum){
                maxsum=sum;
            }
            if(sum<=0){
                sum=0;
            }
        }
        Arrays.sort(nums);
        if(maxsum==0){
            // for(int i=0;i<n;i++){
            //     sum=nums[i]+sum;
            //      maxsum=nums[0];
            //     if(sum>maxsum){
            //         maxsum=sum;
            //     }
            // }\
        return nums[n-1];
        }
        return maxsum;
    }
}