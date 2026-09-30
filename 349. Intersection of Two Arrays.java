class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;

        int temp[]=new int[n1+n2];
        int count=0;

        for(int i=0;i<n1;i++){
            boolean found=false;
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    found=true;
                    break;
                }
            }
                if(!found) continue;

                boolean already=false;
                for(int k=0;k<count;k++){
                    if(temp[k]==nums1[i]){
                        already=true;
                    }
                }
                    if(!already){
                        temp[count++]=nums1[i];
                    }
                }
                    int res[]=new int[count];
                    for(int ia=0;ia<count;ia++){
                        res[ia]=temp[ia];
                    }
                        return res;
        }
            
}
