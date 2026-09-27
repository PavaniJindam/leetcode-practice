// 114 ms | 48.1 MB
class Solution {
    public int lengthOfLongestSubstring(String s) {
        String r="";
        int max=0,l=0,k;
        for(int i=0;i<s.length();i++){
            if(r.indexOf(s.charAt(i))==-1){
                r+=s.charAt(i);
                l++;
            }
            else{
                k=r.indexOf(s.charAt(i));
                r=r.substring(k+1)+s.charAt(i);
                //r+=s.charAt(i);
                l=r.length();
            }
            if(max<l)
             max=l;
        }
        return max;
    }
}