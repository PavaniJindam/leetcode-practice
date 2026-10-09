// 6 ms | 45 MB
class Solution {
    public String largestNumber(int[] nums) {
       String[] arr=new String[nums.length];
       for(int i=0;i<nums.length;i++){
        arr[i]=String.valueOf(nums[i]);
       }

       Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
       StringBuilder s=new StringBuilder();
       for(String i:arr){
            s.append(i);
       }
       String result=s.toString();
       if(result.startsWith("0"))
       return "0";
       return result;
    }
}