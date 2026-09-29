// 24 ms | 92.5 MB
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }
        if(set.size()==nums.length){
            return false;
        }
        // for(int i=0;i<nums.length;i++){
        //     // for(int j=i+1;j<nums.length;j++){
        //     //     if(nums[i]==nums[j])
        //     //     return true;
        //     // }
        // }
        // int left=0,right=1;
        // while(right<nums.length && nums[left]==nums[right++]){
        //     return true;
        // }
        return true;
    }
}