// 2 ms | 43.6 MB
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // for(int i=0;i<n;i++){
        //     j=0;
        //     while(nums2[i]>nums1[j] && j<m+n){
                
        //     }
        // }
        int f=m;
        int temp;
        for(int i=0;i<n;i++)
        {
            nums1[f++]=nums2[i];
        }
        for(int i=0;i<m+n;i++){
            for(int j=i+1;j<m+n;j++)
            if(nums1[i]>nums1[j]){
                temp=nums1[i];
                nums1[i]=nums1[j];
                nums1[j]=temp;
            }

        }
    }
}