// 0 ms | 48.1 MB
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0, right=nums.length-1,k=0,mid,first,last;
        int[] res = {-1, -1};
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                res[0]=mid;
               right=mid-1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        left=0;
        right=nums.length-1;

        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                res[1]=mid;
               left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;
    }
}