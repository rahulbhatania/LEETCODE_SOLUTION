class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int k = pattern.length;
        int count = 0;
        for(int i = k  ; i < nums.length ; i++){
            if(isValid(nums , pattern , i-k , i)) count++;
        }
        return count;
    }

    boolean isValid(int nums[] , int[] arr , int s , int e){
        System.out.println(s+" "+e);
        for(int i = s ; i < e ; i++){
            if(arr[i-s] == 0 && nums[i] != nums[i+1]) return false;
            else if(arr[i-s] == 1 && nums[i] >= nums[i+1]) return false;
            else if(arr[i-s] == -1 && nums[i] <= nums[i+1]) return false;
        }

        return true;
    }
} 