// 279 ms | 47.6 MB
class Solution {
    public int pivotIndex(int[] nums) {
        int index=-1,sum1,sum2;
        for(int i=0;i<nums.length;i++){
            sum1=0;
            sum2=0;
            for(int j=i-1;j>=0;j--){
                sum1+=nums[j];                
            }
            for(int j=i+1;j<nums.length;j++){
                sum2+=nums[j];                
            }
            if(sum1==sum2){
                index=i;
                break;
            }
        }
        return index;
    }
}