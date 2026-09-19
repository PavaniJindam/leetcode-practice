// 497 ms | 47.2 MB
class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp;
        int squares[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            squares[i]=nums[i]*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(squares[i]>squares[j]){
                    temp=squares[i];
                    squares[i]=squares[j];
                    squares[j]=temp;
                }
            }
        }
        return squares;
    }
}