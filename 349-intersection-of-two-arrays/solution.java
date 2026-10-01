// 2 ms | 44.9 MB
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int k=0;
        HashSet<Integer> set1=new HashSet<>();
        // HashSet<Integer> set2=new HashSet<>();
        // int max[]= set1.size()>set2.size()? nums1: nums2;
        // for(int x: nums1)
        // set1.add(x);
        // for(int x: nums2)
        // set2.add(x);
        // set1.retainAll(set2);
        // int[] res=new int[set1.size()];
        // for(int x:set1)
        // res[k++]=x;
        // return res;

        for(int x: nums1)
        set1.add(x);
        int res[]=new int[Math.min(nums1.length,nums2.length)];
        for(int x: nums2){
            if(set1.contains(x))
            res[k++]=x;
            set1.remove(x);
        }
        return Arrays.copyOf(res,k);
    }
}