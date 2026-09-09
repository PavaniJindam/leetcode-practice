// 0 ms | 44.1 MB
class Solution {
    public int maximumWealth(int[][] accounts) {
        int m= accounts.length;
        int n,sum,wealth=0;
        for(int i=0; i<m; i++){
            sum=0;
            n= accounts[i].length;
            for(int j=0;j<n;j++){
                sum+=accounts[i][j];
            }
            if(wealth<sum){
                wealth=sum;
            }
        }
        return wealth;
    }
}