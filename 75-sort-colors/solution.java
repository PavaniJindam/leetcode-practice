// 0 ms | 43.5 MB
class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            zero++;
            if(nums[i]==1)
            one++;
            if(nums[i]==2)
            two++;
        }
        while(zero-->0 && k<nums.length)
        nums[k++]=0;
        while(one-->0 && k<nums.length)
        nums[k++]=1;
        while(two-->0 && k<nums.length)
        nums[k++]=2;
    }
}