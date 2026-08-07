class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int result[] = new int[n];

        Arrays.fill(result,1);
        int pre=1;
        int post=1;

        for(int i=0;i<n;i++)
        {
            result[i]=pre;
            pre=pre*nums[i];
        }
        for(int j=n-1;j>=0;j--)
        {
            result[j]=result[j]*post;
            post=post*nums[j];
        }
        return result;
    }
}  
