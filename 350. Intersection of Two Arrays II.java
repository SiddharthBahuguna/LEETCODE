class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;

        int i=0, j=0, k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i < l1 && j < l2){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                nums1[k++]=nums1[i++];
                j++;
            }
        }
        int res[]=new int[k];
        for(int i1=0;i1<k;i1++){
            res[i1] = nums1[i1];
        }
        return res;
    }
}
