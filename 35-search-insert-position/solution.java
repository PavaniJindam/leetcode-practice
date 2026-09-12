// 0 ms | 44.8 MB
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0, right=nums.length-1,mid,found=0;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                return mid; //return the index if the target is found.
            }
            else if(nums[mid]>target){
                right= mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left; // If not, return the index where it would be if it were inserted in order.
    }
}