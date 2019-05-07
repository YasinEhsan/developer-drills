class Solution {
    public int searchInsert(int[] nums, int target) {
        /*plan
         -  index loop 
          - if taget exists then return 
          - if curr is greater than target return curr index
         - outside loop return len of nums
        

        */
        
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == target)
                return i;
            else if (nums[i] > target)
                return i;
        }
        
        return nums.length;
        
    }
}
