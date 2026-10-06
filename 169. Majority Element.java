class Solution {
    public int majorityElement(int[] nums) {
        //take first candidate as majority element
        //give him 1 vote
        int majority=nums[0], votes=1;

        //start checking from second element
        for(int i=1;i<nums.length;i++){
            //if current candidate has no votes
            if(votes == 0){
                //give one vote to new candidate
                votes++;
                //make current element as new candidate
                majority = nums[i];
            }

            //if current element is same as candidate
            else if(majority == nums[i]){
                //increase candidte vote
                votes++;
            }

            //if current element is different from candidate 
            else{
                // cancel one vote of the candidate
                votes--;
            }
        }
        //return final candidate
        return majority;
    }
}
