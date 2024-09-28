class Solution {
    public int maxSubArray(int[] nums) {
       int sum=0;
       int best_sum=Integer.MIN_VALUE;
       for(int num:nums)
       {
        sum=Math.max(num,num+sum);
        best_sum=Math.max(best_sum,sum);
       }
       return best_sum;
    }
}
