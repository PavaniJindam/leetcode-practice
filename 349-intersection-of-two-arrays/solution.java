// 3 ms | 45.3 MB
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int k=0;
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        // HashSet<Integer> res=new HashSet<>();
        // int min[]= nums1.length<nums2.length? nums1: nums2;
        int max[]= set1.size()>set2.size()? nums1: nums2;
        // int[] res=new int[];
        for(int x: nums1)
        set1.add(x);
        for(int x: nums2)
        set2.add(x);
        // for(int i=0;i<max.length;i++){
        //     if(set1.contains(set2.get(i)))
        //     res[k++]=set2.get(i);
        // }
        set1.retainAll(set2);
        int[] res=new int[set1.size()];
        for(int x:set1)
        res[k++]=x;
        return res;
    }
}