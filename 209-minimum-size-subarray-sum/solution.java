// 1 ms | 69 MB
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0,sum=0,length=0,minlength=nums.length,found=0;
        while(left<=right && right<nums.length){
            sum+=nums[right];
            if(sum>=target){
                found=1;
                length=right-left+1;
                sum-=nums[left];
                left++;
                sum-=nums[right];
                if(minlength>length)
                minlength=length;
            }
            else
                right++;
        }
        if(found==0)
            minlength=0;
        return minlength;
    }
}