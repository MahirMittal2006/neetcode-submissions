class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        while(right<n)
        {
            if(nums[right]==0)
            {
                right++;
            }
            else
            {
                nums[left]=nums[right];
                left++;
                right++;
            }
        }

        while(left<n)
        {
            nums[left]=0;
            left++;
        }
    }
}