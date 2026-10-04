class Solution {
    public int findKthLargest(int[] nums, int k) {  //Quick Select approach
        int target = nums.length-k;
        int left=0,right=nums.length-1;

        while(left <= right){
            int pivotIndex = left + (right - left) / 2;
            
            int temp = nums[pivotIndex];
            nums[pivotIndex] = nums[right];
            nums[right] = temp;

            int pivot = nums[right];

            int i = left;

            for(int j=left; j < right; j++){
                if(nums[j] <= pivot){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
            //Putting pivot in correct position
            temp = nums[i];
            nums[i] = nums[right];
            nums[right] = temp;

            if(i==target) return nums[i];
            else if(i < target) left = i+1;
            else right = i-1;
        }
        return -1;
    }
}
