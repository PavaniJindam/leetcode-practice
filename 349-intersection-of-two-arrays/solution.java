// 3 ms | 45.2 MB
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int k=0;
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        int max[]= set1.size()>set2.size()? nums1: nums2;
        for(int x: nums1)
        set1.add(x);
        for(int x: nums2)
        set2.add(x);
        set1.retainAll(set2);
        int[] res=new int[set1.size()];
        for(int x:set1)
        res[k++]=x;
        return res;
    }
}