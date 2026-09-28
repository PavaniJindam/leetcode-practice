// 3 ms | 51.7 MB
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount=0,left=0,right=0,max=0;
        while(right<nums.length){
            if(nums[right]==0)
                zerocount++;
            right++;

            while(zerocount>k){
                if(nums[left]==0)
                    zerocount--;
                left++;
            }
            max=Math.max(max,right-left);
        }
        return max;
    }
}