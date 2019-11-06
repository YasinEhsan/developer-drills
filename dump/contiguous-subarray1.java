public int maxSubArray(int[] nums) {
       /*PLAN
           - two varaibles store max so far and max right here
           - loop at each index from 1
           - update max right here far by comraing itself to itself += index
           - update max prev now from iself and max right here
           - return max so far

        */

       int maxSoFar = nums[0], maxHere = nums[0];
       for(int index: nums){
           maxHere = Math.max(maxHere + index, index);
           maxSoFar = Math.max(maxHere, maxSoFar);
       }
       return maxSoFar;
   }
