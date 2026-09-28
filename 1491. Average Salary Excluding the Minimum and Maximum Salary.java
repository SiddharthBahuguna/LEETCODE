class Solution {
    public double average(int[] salary) {
        int maxi=salary[0];
        int mini=salary[0];
        int sum=0;
        int n=salary.length;

        for(int i=0;i<salary.length;i++){
            if(salary[i] > maxi){
                maxi = salary[i];
            }
            else if(salary[i] < mini){
                mini = salary[i];
            }

            sum=sum+salary[i];
        }
       double ans=(double)(sum-maxi-mini)/(n-2);
       return ans;
    }
}
