// 2199 ms | 48.5 MB
class Solution {
    int sum,count=0,j;
    public int subarraySum(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            sum=0;
            j=i;
            while(j<nums.length){
                sum+=nums[j];
                if(sum==k){
                    count++;
                    if(j==nums.length-1){
                        break;
                    }
                    else{
                        j++;
                        continue;
                    }
                }
                else{
                    j++;
                }

            }
        }
        return count;
    }
}