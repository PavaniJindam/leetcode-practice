// 1 ms | 76.7 MB
class Solution {
    public int maxSubArray(int[] nums) {
        // int i,j,sum=0,max,left;
        // for(i=0;i<nums.length;i++){
        //     sum+=nums[i];
        // }
        // max=sum;
        // for(i=0;i<nums.length;i++){
        //     sum=0;
        //     left=i;
        //     while(left<nums.length){
        //         sum+=nums[left];
        //         if(max<sum)
        //         max=sum;
        //         left++;
        //     }
        // }

        int cursum,maxsum;
        cursum=nums[0];
        maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            cursum=Math.max(nums[i], cursum+nums[i]);
            maxsum=Math.max(cursum,maxsum);
        }
        //return max;
        return maxsum;
    }
}