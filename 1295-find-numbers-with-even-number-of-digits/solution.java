// 1 ms | 44.7 MB
class Solution {
    public int findNumbers(int[] nums) {
        int temp,digits,count=0;
        for(int i=0;i<nums.length;i++){
            digits=0;
            temp=nums[i];
            while(temp>0){
                digits++;
                temp=temp/10;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}