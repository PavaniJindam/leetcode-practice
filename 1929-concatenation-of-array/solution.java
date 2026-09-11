// 2 ms | 47 MB
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length,j=0;
        int ans[]=new int[2*n];
        for(int i=0;i<2*n;i++){
            ans[i]=nums[j++];
            if(j==nums.length){
                j=0;
            }
        }
        return ans;
    }
}