class Solution {
    public int smallestEvenMultiple(int n) {
        int ans;
        if(n%2==0){
            ans = n*2-n;
        }
        else{
            ans = n*2;
        }
        return ans;
    }
}
