// 2 ms | 69.5 MB
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0,left;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum;
        left=0;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[left++];
            if(max<sum)
                max=sum;
        }
        return (double)max/k;
    }
}