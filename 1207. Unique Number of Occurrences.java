class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            for(int k=0;k<i;k++){
                if(arr[i]!=arr[k]){
                    int count2=0;

                    for(int j=0;j<arr.length;j++){
                        if(arr[k]==arr[j]){
                            count2++;
                        }
                    }
                    if(count==count2){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
