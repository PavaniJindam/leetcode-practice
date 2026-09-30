// 6 ms | 44.1 MB
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count=new int[26];
        if(t.length()!=s.length())
        return false;
        for(int i=0;i<t.length();i++){
            count[t.charAt(i)-'a']++;
            count[s.charAt(i)-'a']--;
        }

        for(int x:count){
            if(x!=0)
            return false;
        }
        return true;
    }
}